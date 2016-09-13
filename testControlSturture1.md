```scala
//import scala.math._
object testControlSturture{
    def main(args: Array[String]):Unit={
      //val x=0

      val x:Int = 0
      val s = if( x > 0 )1 else -1
      val resl = if( x > 0 ) "postive" else -1
      //val resl:Any = -1
      var n = 10
      var r = 1
if ( n > 0 ) {
    r = r*n;
    n -=1
}
val x0 = 1.0  // x0: Double
val y0 = 1.0
var x1 = 4.0
var y1 = 5.0


val distance = {
    val dx = x1 - x0
    val dy = y1 - y0
//sqrt( dx * dx + dy * dy )
}

r = 1
n = 10
while ( n > 0 ) {
    r = r * n
    n -=1
}

r =1
n=10
for( i <- 1 to n){
r = r * i  //i =1, i=2, i=3 … i=10
}
val s1 = "hello" //s1: String. s1 is reference to string

var sum1 = 0

for( i <- 0 until s1.length){  //last value of i is s.length -1
sum1 += s1(i)    //0 to s.length last value is s.length
s1.charAt(i)

}
println(sum1)

    //you can directly loop over the characters
sum1 = 0
for( ch<- "hello") sum1 +=ch

for( i <- 1 to 3; j <- 1 to 3)
  print((10*i + j) + " ")

println(" ")

  for(i <- 1 to 3; j <- 1 to 3 if i != j)
  print((10*i+j)+ " ")

println(" ")

  for(i <- 1 to 3; from = 4 - i ; j <- from to 3)
    print((10*i+j)+ " ")

println(" ")

    val res18 = for( i <- 1 to 10) yield i % 3
    //vector (1, 2, 0, 1, 2, 0, 1, 2, 0, 1)

    val res19 = for( c <- "hello"; i <- 0 to 1) yield (c + i).toChar

    val res20 = for( i <- 0 to 1; c <- "Hello") yield (c + i).toChar
println(" ")
    def abs(x:Double):Double ={
if (x >= 0) x else -x
}

println(abs(3))
println(abs(-3))
println(" ")
def fac(n: Int)= {
var r=2; // var allows mutation
for( i <- 1 to n)  r = r*i
  r
}
//The last expression is value at block
println(fac(10))
println(" ")
def recurisiveFac(n: Int): Int ={
if(n <= 0)
  1
else
  n * recurisiveFac(n-1)
}
  def sum(args: Int*) = {
var result = 0
    for(arg <- args) result += arg
     result
}

val result1 = sum (1, 4, 9, 16, 25)
println(result1)
println(" ")
val result = sum(1 to 5: _*)
//consider 1 to 5 as an argument sequence. Sum(1 to 5) will not compile

def recursiveSum( args: Int*): Int= {
//( args: Int*) is a argument sequence
if( args.length==0)
 0
else args.head + recursiveSum(args.tail: _*)
// args.head is the first element of the sequence
//args.tail is the rest of the sequence
}

def box(s: String): Unit ={
//Unit is like void
val border = "_" * s.length + "--\n"
//“_” * s.length produces s.lenght number of _
println("\n" + border + "|" + s + "|\n" + border)
}
box("ferd")
box("Wilma")
    } //end of main
} //end of object
```
