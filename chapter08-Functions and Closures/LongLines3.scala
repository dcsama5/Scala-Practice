import scala.io.Source

object LongLines3 {
  object LongLines {
    def processFile(filename: String, width: Int) {
      def processLine(line: String) {
    
        if (line.length > width)
          println(filename +": "+ line)
      }    
    
      val source = Source.fromFile(filename)
      for (line <- source.getLines()) {
        processLine(filename, width, line)
      }
    }
  }
    def main(args: Array[String]) = FindLongLines.main(args)
}
