import scala.collection.mutable
import scala.collection.JavaConversions.propertiesAsScalaMap
import scala.collection.JavaConversions.mapAsJavaMap
import java.awt.font.TextAttribute._

object testMapandTuple {
    def main(args: Array[String]):Unit={

  val score1 = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

  //construct a mutable map
  val score2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

  //access Map values
  val bobsScore1 = score1("Bob")
  println("bobsScore1: " + bobsScore1)
  val bobsScore2 = score1.getOrElse("Bob",0)
  println("bobsScore2: " + bobsScore2)
  val res12 = score1.get("Bob")
  println("res12: " + res12)
  val res13 = score1.get("Fred")
  println("res13: " + res13)
  //update map value
  val score3 = scala.collection.mutable.Map("Alice" -> 10, "Bob" ->3, "Cindy" -> 8)
  println()
  println("score3: ")
  for((k,v) <- score3) println(k + " is mapped to " + v)
  println()
  println("Lets map Bob to 10...")
  score3("Bob") = 10
  println("Bob is mapped to " + score3("Bob"))
  println("Lets add Fred and map it to 7...")
  score3("Fred") = 7
  println("Fred is mapped to " + score3("Fred"))
  println()
  println("Lets map Bob to 11, add jack and map it to 15 and remove Alice...")
  score3 += ("Bob" -> 11, "jack" -> 15)
  score3 -= "Alice"
  for((k,v) <- score3) println(k + " is mapped to " + v)

  println()
  val score5 = Map("Alice" -> 10, "Bob" -> 3, "Cindy" ->8)
  println("score5: ")
  for((k,v) <- score5) println(k + " is mapped to " + v)

  println()
  println("score6: ")
  val score6 = score5 + ("Bob" -> 10, "Fred" -> 7)
  for((k,v) <- score6) println(k + " is mapped to " + v)

  println()
  var score7 = Map("Alice" -> 10, "Bob" ->3, "Cindy" -> 8)
  println("score7 before any changes: ")
  for((k,v) <- score7) println(k + " is mapped to " + v)

  score7 = score7 + ("Bob" -> 10, "Fred" -> 7)
  score7 = score7 - "Alice"
  println()
  println("Lets add Bob and map it to 10, lets add Fred and map it to 7 and remove Alice...")
  for((k,v) <- score7) println(k + " is mapped to " + v)
  println()

  val score8 = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
  println("score8: ")
  for((k,v) <- score8) println(k + " is mapped to " + v)
  println()

  val res14 = score8.keySet
  println("returning all keys: " + res14)
  val res15 = for((k,v) <- score8) yield (v, k)
  println("res15: " + res15)
  println()

  println("Sort the map by the keys: ")
  val score9 = scala.collection.immutable.SortedMap("Alice"-> 10, "Fred" -> 7, "Bob" -> 3, "Cindy" -> 8)
  for((k,v) <-score9) println(k +" "+ v)
  println()

  //val props: scala.collection.Map[String, String] = System.getProperties()
  //for((k,v) <- props) println( k +" "+ v)


  //This is a scala map
  val attrs = Map(FAMILY -> "Serif" , SIZE -> 12)

  //experts a Java Map
  val font = new java.awt.Font(attrs)
  val t = (1, 3.14, "Fred")
  val second = t._2
  val (a,b,c)= t
  val (a1, b1, _) = t


  val res16 = "New York".partition(_.isUpper)
  println("res18: " + res16)
  println()

  val symbols = Array("<", "-", ">")
  val counts = Array(2,10,2)
  val pairs = symbols.zip(counts)
  for ((s,n) <- pairs) Console.print(s*n)
  val res17 = symbols.zip(counts).toMap
  println()
  println("res17: " + res17)

  def countWords(text: String): mutable.Map[String, Int] = {
  val counts = mutable.Map.empty[String, Int]
  for(rawWords <- text.split("[ ,!.]")) {
        val word = rawWords.toLowerCase
        val oldCount = if(counts.contains(word)) counts(word) else 0
        counts += (word -> (oldCount +1))
  }
  counts
  }
  println()
  val res18 = countWords("Run Spot run! Run, Spot, Run")
  println("res18: " + res18)


  }
}
