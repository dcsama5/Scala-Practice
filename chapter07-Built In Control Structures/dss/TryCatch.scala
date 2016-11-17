import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

try {
  val f = new FileReader("input")
} catch {
    case ex: FileNotFoundException => {println("filenotFound")}
    case ex: IOException => {println("ioexception") }
}