import java.net.URL
import java.net.MalformedURLException

def urlFor(path:String) = 
try {
  val url = new URL(path)
  val content = url.getContent()
  println(content);println("ji")
}
catch {
  case e:MalformedURLException => println("x")
}

urlFor("httw://rakeru.wwwwwwwwwtumblr.com");
