// ERROR: None of the following functions can be called with the arguments supplied:  public constructor FileInputStream(p0: [ERROR : Unresolved java classifier: FileDescriptor]!) defined in java.io.FileInputStream public constructor FileInputStream(p0: java.io.File!) defined in java.io.FileInputStream public constructor FileInputStream(p0: kotlin.String!) defined in java.io.FileInputStream
// ERROR: Type mismatch: inferred type is java.io.DataInputStream but java.io.InputStream! was expected
// ERROR: Assignments are not expressions, and only expressions are allowed in this context
// ERROR: Unresolved reference: close
import java.io.*

object FileRead {
    jvmStatic public fun main(args: Array<String>) {
        try {
            val fstream = FileInputStream()
            val `in` = DataInputStream(fstream)
            val br = BufferedReader(InputStreamReader(`in`))
            var strLine: String
            while ((strLine = br.readLine()) != null) {
                println(strLine)
            }
            `in`.close()
        } catch (e: Exception) {
            System.err.println("Error: " + e.getMessage())
        }

    }
}