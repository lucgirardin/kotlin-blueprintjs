@file:DependsOn("com.beust:klaxon:5.4")

import com.beust.klaxon.Klaxon
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.concurrent.TimeUnit

fun printlnGreen(message: String) = printlnColor(message, "\u001B[32m")
fun printlnRed(message: String) = printlnColor(message, "\u001B[31m")
fun printlnColor(message: String, ansiColor: String) = println("$ansiColor$message\u001B[0m")

private val moduleName  = "@blueprintjs/core"
private val packageName = "com.palantir.blueprintjs"
private val outputDir = Paths.get("src/main/kotlin").toFile()
private val outputDirPath = Paths.get(outputDir.absolutePath)
private val nodeModulesDir = Paths.get("build/js/node_modules").toFile()
private val nodeModulesDirPath = Paths.get(nodeModulesDir.absolutePath)

main()

fun main() {
    val indexTs = findModuleTypeDeclarationsIndex()

    println("Running dukat on $indexTs...")
    val ktFiles = runDukat(listOf(indexTs))

    println("Post-processing ${ktFiles.size} Kotlin files...")
    val moduleInFilename = moduleName.replace('/', '_')
    ktFiles.filter { it.toString().endsWith("module_$moduleInFilename.kt") }.forEach(::postProcessKotlinFile)
}

fun findModuleTypeDeclarationsIndex(): Path {
    val moduleDirPath = nodeModulesDirPath.resolve(moduleName)
    val typesRelativePath = extractTypings(moduleDirPath.resolve("package.json"))
    val typesPath = moduleDirPath.resolve(typesRelativePath)
    if (!Files.exists(typesPath)) {
        error("Bad typings entry in package.json: $typesPath does not exist")
    }
    return typesPath
}

fun extractTypings(packageJsonPath: Path): String {
    val modulePackageJson = Klaxon().parse<PackageJson>(packageJsonPath.toFile())!!
    return modulePackageJson.typesPath ?: error("No 'typings' nor 'types' entry in package.json")
}

data class PackageJson(
    val types: String? = null,
    val typings: String? = null,
) {
    val typesPath: String?
        get() = types ?: typings
}

fun postProcessKotlinFile(ktFilePath: Path) {
    val file = ktFilePath.toFile()
    val contents =
        file.readText().addModuleAndPackage().fixConstructorTypeParameter().fixInitializedValues().fixPartials()
    file.writeText(contents)
}

fun String.addModuleAndPackage(): String {
    if ("package " in this) {
        return this
    }
    val header = "@file:JsModule(\"$moduleName\")\npackage $packageName\n\n"
    return if ("@file:" in this) {
        replace(Regex("""(@file:.*\s*)+""")) { m -> "${m.value}\n$header" }
    } else {
        header + this
    }
}

// https://github.com/Kotlin/dukat/issues/414
fun String.fixConstructorTypeParameter(): String {
    // class FileInput(props: P = definedExternally, context: Any = definedExternally) : AbstractPureComponent2__1<IFileInputProps>
    // class Drawer(props: P = definedExternally, context: Any = definedExternally) : AbstractPureComponent2__1<IDrawerProps>
    // class Icon(props: P = definedExternally, context: Any = definedExternally) : AbstractPureComponent2__1<IIconProps>
    // class Button(props: P = definedExternally, context: Any = definedExternally) : AbstractButton<ButtonHTMLAttributes<HTMLButtonElement>> {
    return replace(Regex("""class ([^)]+)\(props: P = definedExternally, context: Any = definedExternally\)\s*:\s*AbstractPureComponent2__1<([^/>]+(/\*[^*]+\*/)?)>"""),
        "class $1(props: $2 = definedExternally, context: Any = definedExternally): AbstractPureComponent2__1<$2>").replace(
        Regex("""class ([^)]+)\(props: P = definedExternally, context: Any = definedExternally\)\s*:\s*AbstractPureComponent2__2<([^,]+)\s*(,\s*[^,]+\s*)?>"""),
        "class $1(props: $2 = definedExternally, context: Any = definedExternally): AbstractPureComponent2__2<$2$3>")
        .replace(Regex("""class ([^)]+)\(props: P = definedExternally, context: Any = definedExternally\)\s*:\s*AbstractButton<([^/>]+(/\*[^*]+\*/)?)>"""),
            "class $1(props: IButtonProps = definedExternally, context: Any = definedExternally): AbstractButton<$2>")
}

// https://github.com/Kotlin/dukat/issues/415
fun String.fixInitializedValues(): String {
    // var SIZE_SMALL: Any = 20
    // var SIZE_SMALL: Any = "360px"
    return replace(Regex("""(va[rl])\s+(\w+)\s*:\s*(\w+)\s*=\s*((\d+)|("[^"]*"))"""),
        "$1 $2: $3 = definedExternally")
}

// https://github.com/Kotlin/dukat/issues/416
fun String.fixPartials(): String {
    // these interfaces only contains nullable properties anyway, so there is no need for their -Partial version
    return replace("""IPropsPartial""", "IProps").replace("IIntentPropsPartial", "IIntentProps")
        .replace("IPopoverSharedPropsPartial", "IPopoverSharedProps")
}

fun runDukat(tsFiles: List<Path>): List<Path> {
    val filePaths = tsFiles.map { f -> f.toString() }.toTypedArray()
    val lines = exec("dukat", "-m", moduleName, "-d", outputDir.toString(), *filePaths)
    return lines.map { outputDirPath.resolve(it) }
}

fun exec(vararg arguments: String): List<String> {
    val file = createTempFile("output-lines")
    ProcessBuilder(*arguments)
        .redirectOutput(ProcessBuilder.Redirect.appendTo(file))
        .redirectError(ProcessBuilder.Redirect.INHERIT)
        .start()
        .waitFor(60, TimeUnit.SECONDS)
    val lines = file.readLines()
    file.delete()
    return lines
}
