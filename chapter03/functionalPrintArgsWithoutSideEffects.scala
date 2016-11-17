def formatArgs(args:Array[String]) = args.mkString("\n");

object functionalPrintArgsWithoutSideEffects {
  def main(args:Array[String]) : Unit = {
    //println(formatArgs(args))
    /*for(arg <- args)
      println(arg)*/
      println("hello")
  }
}

