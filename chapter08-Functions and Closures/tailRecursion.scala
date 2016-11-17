val funValue = nestedFun _

def nestedFun(x: Int) {
  if(x!=0) {
    println(x);
  funValue(x-1) }
}
