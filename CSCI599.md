## __Day 1__

In scala, almost all constructs have values. This feature can make program more  concise and easier to read
 (conform to functional style). In contrast, java has many statements
 ```scala
object testControlSturture{
	det main( args: Array[String]): Unit = {
```
Val means you can’t mutate value at x. in function style, mutation is  evil.
```scala
val x=0
```
  This will give a compiling error. type of x is inferred.
```scala
  x = 5		
  ```

Since 0 is integer , compiler will inter x is Int. Type inference makes your code concise.
```scala
  val x: Int = 0
  ```

```java
  java int x = 0; 	
```
Scala is static-typing language. Type of variable can be inferred.

  If expression has value s: Int = -1. Also note that 'Any' is superclass for all scala classes
```scala
val s = if( x > 0 ) else -1
val resl = if( x > 0 ) else -1
resl:Any = -1  	
```

#### Statement Termination

Var means you can change value of n

	var n = 10		

This is imperative style.

		n:Int		

Scala is purely object-oriented language

	Int <— Object 	
	int <— Primitive type
  Note that you can drop semicolon if it falls just before end of line

	var r = 1
	if ( n > 0 ) {
		r = r*n;
		n -=1,
		}


#### Block expressions and assignments

  In scala, a { } block contains a sequence of expressions and the reuslt is also an expressions. The value of the block is the value of the last expressions.

  Things to note this is section of code: _ is like * in java where you import all members of math class. the last line is your return value because last   expression is the value of whole block.
```scala
	val x0 = 1.0  // x0: Double
	val y0 = 1.0
	var x1 = 4.0
	var y1 = 5.0
	import scala.math._		
	val distance = {
			val dx = x1 - x0
			val dy = y1 - y0
sqrt( dx * dx + dy * dy )
```


  In Scala, don't use the return statement. return is rarely used in Scala. Futhermore, assignments that have no value are said to have a value of type Unit. Unit is like void in Java.

  This line of code won't work because you can’t assign Unit to x
  () (value of Unit) type mismatch: fount Unit required Double

```scala
x1 = y1 = 1
```

while loops (is rarely used in Scala) because it has mutation

Note that r = r * n will muatate the value of r in each iteration
```scala
	r = 1
	n = 10
	while ( n > 0 ) {
		r = r * n 	
		n -=1
```

#### For loops

1 to n is the range (have the value 1 2 3 4 5 … n)

```scala
r =1
n=10
for( i <- 1 to n){ 		 
r = r * i 		//i =1, i=2, i=3 … i=10
	}
```
the construct for ( i <- expr) moves the variable; transverse all values of the expression to the right of the <-

For a scam collection such as range, the loop make; assume each value in turn. the type of the variable is the element type of collection. you can’t mutate; in the loop. for loops is purely functional style.

```scala
val s1 = “hello” //s1: String. s1 is reference to string

var sum1 = 0

for( i <- 0 until s.length)	 //last value of i is s.length -1
sum += s1(i)	//0 to s.length last value is s.length
sl.charAt(i)

println(sum1)
	//you can directly loop over the characters
sum1 = 0
for( ch<- “hello”) sum1 +=ch
	} //end of main
} //end of object

```
