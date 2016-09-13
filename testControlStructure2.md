```scala
import scala.math._
import scala.io.Source


object testControlStructure2 {
def main(args:Array[String]):Unit= {

def printInputs( inputs: Array[String]): Unit = {
var i = 0
while( i < inputs.length) {
  println(inputs(i))
        i +=1
    }
}

def printInputs_2(inputs: Array[String]): Unit = {
for(input <- inputs)
    println(input)
}

def printInput_3(inputs: Array[String]): Unit = {
    inputs.foreach(println)
}

def formatInput4(inputs:Array[String]): String ={
    inputs.mkString("\n")
}

val res = formatInput4(Array("zero", "one", "two"))
assert(res== "zero\none\ntwo")


val Lines_2 = Source.fromFile("Documents/599Notes/CSCI599.md").getLines.toList

def widthOfLength(s:String) : Int = {
    s.length.toString.length
}

var maxWidth = 0
for(line <- Lines_2)
    maxWidth = maxWidth.max(widthOfLength(line))

val LongestLine = Lines_2.reduceLeft((a,b) => if(a.length > b.length) a else b )
val maxWidth_2 = widthOfLength(LongestLine)

for ( line <- Lines_2) {
val numSpaces = maxWidth_2 - widthOfLength(line)
val padding = " " * numSpaces
println(padding + line.length + "  | " + line)
} //end of for loops

}
}
```
