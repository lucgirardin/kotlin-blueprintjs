import java.nio.file.Path
import java.util.concurrent.TimeUnit

fun runDukat(moduleName: String, outputDir: Path, tsFiles: List<Path>): List<Path> {
    val filePaths = tsFiles.map { f -> f.toString() }.toTypedArray()
    val lines = exec("dukat", "-m", moduleName, "-d", outputDir.toString(), *filePaths)
    return lines.map { outputDir.resolve(it) }
}

private fun exec(vararg arguments: String): List<String> {
    val file = createTempFile("output-lines")
    ProcessBuilder()
        .command(*arguments)
        .redirectOutput(ProcessBuilder.Redirect.appendTo(file))
        .redirectError(ProcessBuilder.Redirect.INHERIT)
        .start()
        .waitFor(60, TimeUnit.SECONDS)
    return file.readLines()
}
