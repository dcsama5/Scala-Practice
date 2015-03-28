import scala.collection.mutable.Map

object ChecksumAccumulator {
  private val cache = Map[String, Int]()
  
  def calculate(s:String): Int = 
  if(cache.contains(s)) {
    println("hello")
    cache(s)
  }
  else {
    val acc = new ChecksumAccumulator
    var int = 0;
    for(c <- s) {
      acc.add(c.toByte)
      int +=1;
      println(int)
    }
    val cs = acc.checksum()
    cache += s-> cs
    cs
  }
}
class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = sum += b
  def checksum(): Int = ~(sum & 0xFF) + 1
}
