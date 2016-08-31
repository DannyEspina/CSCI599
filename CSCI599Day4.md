# Day 4

#### ControlStructure3.scala

```scala
object testControlStructure3{
det main (args: Array[String]):Unit={
```

Calculate greatest common divisor with a while loop. Find GCD for x and y.
 This is Java code without semicolon.
```scala
det gcdLoop(x:Long, y:Long):Long={
	var a = x // mutation
	var b = y
	while( a!=0){
		val temp = a
		a = b%a
		b = temp
	} //end of while loop
	b // return value. Last expression in the block is the return value
}
```
##### Pure functional style

```scala
def gcd(x:Long, y:Long):Long =
	if(y==0) x else gcd(y, x%y)
```
if(y==0) is the base case and gcd(y, x%y) is the recursive case.

The difference between these tow approaches is that gcdLoop is written in an imperative style,  using vars and a while loop. gcd is written in a more functional style that involves recursion ( gcd call it self) and require  no vars (mutation)

#### For expressions

Listing files in a directory with a for expression.
//file[] filesHere

```scala
val filesHere = (new java.io.file(“/home/jetzhong/scalahow”)).ListFiles
//file will range over filesHere
for( file <- filesHere)
	println(file)
println()

for(i <- 1 to 4 )
	println(“Iteration ” + i)
println()
```

If you don’t want to include upper bound of the range, use _until_ instead of _to_

```scala
for(i <- 1 until 4)
	println(“Iteration “ + i)
```

#### Filtering

Sometimes you don’t want to iterate through a collection in its entirety, you want to filter it down to some subsets. Find scala files using a for with a filter

```scala
for( file <- filesHere  if file.getName.endsWith(“.scala”))
	println(file)
```

You can include more files if you want. Just keep adding if clause


```scala
for (
	file <- filesHere
	if file.isFile
	if file.getName>endsWith(“.scala”)
) println(file)
```

#### Nested iteration

if you add multiple <- clauses, you will get nested loops using multiple generators in a for expression.

List is immutable data structure. Each element of list is holding one line in the file.
```scala
def fileLines(file: java.io.File): List[String] =
	scala.io.Source.fromFile(file).getLines().toList
```

Print out line matching input pattern for .scala file

```scala
def grep(pattern: String): Unit =
	for(
		file <- fielsHere
		if file.getName.endsWith(“.scala”);
		line <- fileLnes(file) // array of string for each file
		if line.trim.matches(pattern)
	    ) println(file + “:  “ + line.trim)
```

The outer loop iterates through filesHere, and inner loop iterates through fileLines(file) for any file that ends with .scala inner loop iterates reach faster than outer loop.

`.*S.*` matches s followed by zero or more characters “s”, “saw”, “seed”.
```scala
//match any line that has “gcd”
grep(“.*gcd.*)
```
