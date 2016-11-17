val someNumbers = List(-11,-10,-5,0,5,10)
val t = ("ww",2, 3.4)
val y = someNumbers.toList
val x = LongLines
if(t._1.isInstanceOf[String])
  println("yes")
someNumbers.filter(_ > 0) //infers _ as placeholder syntax
someNumbers.filter(y => y> 0)
//t.filter(x=> x instanceof "String") does not work because tuple does not have a filter method
def sum(a:Int, b:Int, c:Int) = a + b + c
val a = sum _
val b = sum(1, _:Int, 3)
b.apply(2)

