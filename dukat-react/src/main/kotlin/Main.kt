import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.NoOpCliktCommand
import com.github.ajalt.clikt.core.context
import com.github.ajalt.clikt.core.subcommands
import com.github.ajalt.clikt.output.CliktHelpFormatter
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.arguments.defaultLazy
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
import com.github.ajalt.clikt.parameters.types.file
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.runBlocking
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

fun main(args: Array<String>) = RootCmd.subcommands(Generate).main(args)

object RootCmd : NoOpCliktCommand(name = "dukreact") {
    init {
        context {
            helpFormatter = CliktHelpFormatter(showDefaultValues = true, showRequiredTag = true)
        }
    }
}

object Generate : CliktCommand(name = "generate", help = "Generate Kotlin from TS declarations") {

    private val moduleName by option("-m",
        help = "Use this value as @file:JsModule annotation value whenever such annotation occurs") //
        .default("@blueprintjs/core") // TODO remove this default

    private val packageName by option("-p", help = "Package name for the generated files") //
        .default("com.palantir.blueprintjs") // TODO remove this default

    private val outputDir by option("-d", help = "Overrides the directory in which to generate the new key classes") //
        .file(canBeFile = false, canBeDir = true) //
        .required()

    private val tsDir by argument(name = "TYPESCRIPT_DIR", help = "The directory containing the .d.ts files to convert") //
        .file(mustExist = true, canBeFile = false, canBeDir = true) //
        .defaultLazy {
            Paths.get("build/js/node_modules/@blueprintjs/core/lib/esm").toFile()
        }

    override fun run() = catchAndPrintErrors {
        val tsTmpDirPath = step("Creating temp dir for TS files...") {
            Files.createTempDirectory("ts-dukat-temp")
        }
        val tsTmpDir = tsTmpDirPath.toFile()
        tsTmpDir.deleteOnExit()
        step("Copying TS files to temp dir (to avoid filename bug)...") {
            tsDir.copyRecursively(tsTmpDir, overwrite = true) { file, ioException ->
                throw RuntimeException("Error while copying $file", ioException)
            }
        }
        val target = Paths.get(outputDir.absolutePath)
        val dirs = tsDir.recursivePathMappings(target) { it.extension == "ts" }
        val tsFiles = dirs.flatMap { it.sourceFiles }.map { it.toPath() }

        val ktFiles = step("Running dukat on ${tsFiles.size} TS files...") {
            runDukat(moduleName, target, tsFiles)
        }

        step("Post-processing ${ktFiles.size} Kotlin files...") {
            val moduleInFilename = moduleName.replace('/', '_')
            ktFiles.filter { it.toString().endsWith("module_$moduleInFilename.kt") }.forEach(::postProcessKotlinFile)
        }
    }

    private fun postProcessKotlinFile(ktFilePath: Path) {
        val file = ktFilePath.toFile()
        val newContents = file.readText().addModuleAndPackage()
        file.writeText(newContents)
    }

    private fun String.addModuleAndPackage(): String {
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

    private fun catchAndPrintErrors(block: suspend CoroutineScope.() -> Unit) {
        val result = runCatching { runBlocking { block() } }
        val exception = result.exceptionOrNull()
        if (exception != null) {
            System.err.println(exception.message)
            exception.printStackTrace()
        }
    }
}
