object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles
  
  private def filesMatching(query: String, matcher:(String, String) => Boolean) = {
   val f = for(file<-filesHere; if matcher(file.getName, query))
      yield file
    println(f.length)
  }
  
  def filesEnding(query: String) = filesMatching(query, _.endsWith(_))
  
  def main(args:Array[String]) {
    filesEnding(".scala")
  }
}

