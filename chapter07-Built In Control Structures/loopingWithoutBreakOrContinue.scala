val filesHere = new java.io.File(".").listFiles;

var i = 0
var foundIt =false
var name = ""
while(i<filesHere.length && !foundIt) {
  if(!filesHere(i).getName.startsWith("-")) {
    if(filesHere(i).getName.endsWith(".scala"))
    {
      foundIt=true
      name = filesHere(i).getName
    }
  }
  i = i + 1 
}
  println(name)

