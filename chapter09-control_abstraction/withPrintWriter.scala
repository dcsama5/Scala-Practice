import java.io._

def withPrintWriter(file:File, op:Writer => Unit) {
  val outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file))
  try {
    op(outputStreamWriter)
  }
  finally {
    outputStreamWriter.close
  }
}

withPrintWriter(
  new File("date.txt"),
  outputStreamWriter => outputStreamWriter.write("hello world")
  )
