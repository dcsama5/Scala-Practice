def method() = {
  val candy = "CANDY"
  for(c<-candy) yield {
    c
  }
}
  
  val c = method();
  println(c);
