# Day 3

#### for loop for comprehension

Exception: when you throw an exception, current computation. Is aborted, and the run time system looks for exception handles.

Like asterisk. You want to use a shorter name.
Sqrt(x) comes from scala.math.sqrt(x)
```scala
Import scala.math._

det root(x: Double) =
if (x>=0) sqrt(x)
else throw new IllegalArgumentException  //(“x should not be negative”)
try {
println(root(4))
println(root(-4))
}
catch {
	case e: Exception -> println(e)
}
```
controlStructure2.scala
```scala
object ControlSturcture2 {
det main(args:Array[String]):Unit= {
```

We will learn to recognize functional style. Consider the following while loop example, which uses a var and therfore in the imperative style. Things to note: i += 1 is a mutation
```scala
det printInputs( inputs: Array[String]): Unit = {
var I = 0
while( I < inputs.length) {
  println(inputs(i))
		i +=1
	}
}
```

You can transform this bit of code into a more function style by getting rid of var.
Note that for every iteration, you declare val input, and input can’t be mutated.
```scala
det printInputs_2(inputs: Array[String]): Unit = {
for(input <- inputs)
	println(input)
}
```
foreach will process each element and call println. println is a side effect. It’s difficult to test.
```scala
det printInput_3( inputs: Array[String]): Unit =
	inputs.foreach(println)
```
The refactored (more functional) code is clearer, more concise, less error prone than the original (more imperative) code.

We are moving toward pure functional style: no side effect (println) or vars (mutation)
```scala
det formatInput.4(imputs:Array[String]): String =
imports.mkString(“\n”)
```
One benefits of of this approach is that it can help  your program be easier to test. You could test formatInputs function simply by checking the result.
```scala
val res == formatInputs.4(Array(“zero”, “one”, two”)) j
assert( res== “zero\none\ntwo)
```
A balanced attitude for scala programmer prefer val, immutable objets, and methods without side effect. Reach for then first. Use vars, mutable objects, and methods with side effects when you have a specific need and justification  for them.
You will build a script that reads lines from a file and prints them out prepended with number of character for each line.
getLines method returns an Iterator[String], which provides one line on each iteration, excluding end-of-line character.
```scala
import scala.io.Source
val Lines_2 = Source.fromFile(“/bins/jeilog/bigdata_li/README.txt”).getLines.toList
```
Lines_2 : List[String] each String contain one line of text. Also List is immutable data structure.
Write a small function that calculates the width of each line’s character count.
Note that s.length.toString.length is the character count.
```scala
def widithOfLength(s:String) : Int =
	s.length.toString.length
```
Writing this function, you could calculate maximum width with imperative style.
```scala
var maxWidth = 0
for(line <- Lines_2)
	maxWidth = maxWidth.max(widthOfLeength(line))
```

Alternatively, if you prefer to find maximum without vars, you could find the longest line like this
```scala
val LongestLine = Line_2.reduceLeft((a,b) -> if(a.length > b.length)  a else b )

val maxWidth_2 = widthOflength(longestLine)
for ( line <- Lines_2) {
val numSpaces = maxWidth_2 – widthOfLength(line)
val padding = “ “ * numSpaces
println( padding + line.length + “  | “ + line)
} //end of for looops
```
