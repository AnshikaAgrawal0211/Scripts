import scala.io.Source
import java.io._

val filename = "/home/randhir/development/src/main/scala/code.txt"
val out = new File("/home/randhir/development/src/main/scala/query.txt")
val bw = new BufferedWriter(new FileWriter(out))
val id = "asdcbhiopl23458ygbyhvf"
var i = 740
for (line <- Source.fromFile(filename).getLines) {
  i=i+1
  val s = s"Insert into postal_codes values($i, 1, '$line', '$id');"
  bw.write(s+"\n")
}
bw.close()