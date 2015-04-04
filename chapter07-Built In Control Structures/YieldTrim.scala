/**
  Still don't understand MidStream variable bindings 100%
  
  **/
def fileLines(file: java.io.File) = 
  scala.io.Source.fromFile(file).getLines().toList

val filesHere = new java.io.File(".").listFiles
  var linenumber = 0
val forLineLengths = for {
  file <- filesHere
  if file.getName.endsWith(".scala")
  line <- fileLines(file)
  linenumber +=1
  if trimmed.matches(".*for.*")
} yield trimmed

/*val forlinelength = 
  for(file <- filesHere)
    if(file.getName.endsWith(".scala")
      for(line<-fileLines(file) {
        trimmed = line.trim
        if(trimmed.matches(".*for.*")
      } yield {
        trimmed
        }*/
        
    
for(ints <- forLineLengths)
  println(ints)
