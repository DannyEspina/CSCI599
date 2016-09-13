```scala
object testControlStructure3{
def main (args: Array[String]):Unit={

  def gcdLoop(x:Long, y:Long):Long={
    var a = x // mutation
    var b = y
    while( a!=0){
        val temp = a
        a = b%a
        b = temp
    } //end of while loop
    b // return value. Last expression in the block is the return value
}

def gcd(x:Long, y:Long):Long =
    if(y==0) x else gcd(y, x%y)

val filesHere = (new java.io.File("Documents/599Notes/")).listFiles()
//file will range over filesHere
for( file <- filesHere)
    println(file)
println()

for(i <- 1 to 4 )
    println("Iteration " + i)
println()

for(i <- 1 until 4)
    println("Iteration " + i)
println()

for(file <- filesHere  if file.getName.endsWith(".scala"))
    println(file)
println()

for (file <- filesHere if file.isFile if file.getName.endsWith(".scala"))
    println(file)
println()

def fileLines(file: java.io.File): List[String] = {
    scala.io.Source.fromFile(file).getLines().toList
}

def grep(pattern: String): Unit ={
for(file <- filesHere if file.getName.endsWith(".scala"); line <- fileLines(file) // array of string for each file
    if line.trim.matches(pattern)) println(file + ":  " + line.trim)
}

grep(".*gcd.*")



//s.* matches s followed by zero or more characters
//.*gcd.* matches any line that has "gcd"
//variable definition in for loops
//a variable named trimmed is introduced halfway through for expression
//That variable is initalized to the result of Line.trim

def grep3(pattern: String): Unit = {
for{
file <- filesHere //range over list of file
if file.getName.endsWith(".scala") //boolean expression
line <- fileLines(file) //range over list of Line for each file
trimmed = line.trim // new vaariable definition
if trimmed.matches(pattern)
} 
println(file + ": " + trimmed)
}
//if you use curly braces, you can drop all semicolons
//while all of examples so far have operated on interated values and then forgotten them
//you can alos generate a value to remember for each iteration
//basically you can save values generated in each iteration into a collection
//for example here is a function that identifies the .scala file and stores them in an array

def scalaFiles: Array[java.io.File] = {
for{
file <- filesHere
if file.getName.endsWith(".scala")
} 
yield file
}
//the syntax of for-yeild expression is like this:
//for clauses yeild body
//Transforming an Array[File] to Array[Int] with a for

val forLineLengths: Array[Int] ={
for{
file <- filesHere
//go through structure looking for file whose name ends with scala
if file.getName.endsWith(".scala")
//in this file it is looking for line containing "for"
line <- fileLines(file)
//then it generates length of line
trimmed = line.trim
if trimmed.matches(".*for.*")
}
yield trimmed.length
}



def searchFrom(i: Int): Int = {
if(i >= args.length) - 1
else if(args(i).startsWith("-")) searchFrom(i + 1)
else if(args(i).endsWith(".scala")) i
else searchFrom(i + 1)
}

//multiplication table

def printMultiTable(): Unit = {
var i = 1
while(i <= 10){
var j = 1 //column counter
while(j <= 10){
val prod = (i * j).toString
var k = prod.length //size of product
//every product number has maximum four spaces
while(k < 4){
print(" ")
k += 1
}
print(prod)
j += 1
}//end while loop for j
println()
i += 1
}//end while loop for i
}// end function

//refactor imperative-style code
//return a row as a sequence of String
//each String is one piece in that row
//row is row number

def makeRowSeq(row: Int): Seq[String] = 
for(col <- 1 to 10) yield {
val prod = (row * col).toString
val padding = " " * (4 - prod.length) //method name can be operator
padding + prod
}//end of makeRowSeq
//return a row as a string
//mkString will concatenate the strings in the sequence and return them as one string

def makeRow(row: Int): String = makeRowSeq(row).mkString

//return a table as a string with one row per line

def multiTable_2(): String = {
//result of this for expression will be sequence of row String
val tableSeq=
for(row <- 1 to 10)
yield makeRow(row)
tableSeq.mkString("\n")
}
println(multiTable_2())

}
}
```
