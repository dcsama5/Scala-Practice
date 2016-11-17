def half(n:Int) : Int =  {
  val half = if(n%2 ==0)
    n/2
  else
    throw new RuntimeException("n must be even")
  half
  
}
half(3);
