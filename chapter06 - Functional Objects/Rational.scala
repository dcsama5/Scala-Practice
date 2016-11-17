class Rational(n:Int, d:Int) {
  require(d!=0)
  
  private val g = { println("first"); gcd(n.abs, d.abs);} 
  
  val numer = {println("x") ;n/g}
  val denom = d/g
   
  def this(n: Int) = this(n, 1);
  
  def +(that:Rational): Rational = new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
  
  def +(i: Int): Rational = new Rational(numer + i * denom, denom)
  
  def * (that:Rational) : Rational = new Rational(numer * that.numer, denom * that.denom)
  
  override def toString = numer+"/"+denom;
  
  private def gcd(a: Int, b: Int): Int = {
    println("hello"+a+"|"+b);
    if(b==0) a else gcd(b, a % b)
  }
      
}