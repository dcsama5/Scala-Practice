//

object functional {
  def main(args:Array[String]) {
    println(formatArgs(args))

  }
  def formatArgs(args:Array[String]) = args.mkString;
}

