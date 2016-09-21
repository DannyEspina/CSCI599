object ScalaHomework2{
    def main(args: Array[String]):Unit={

def signum(x: Int): Int ={
if (x>0) 1 else if (x<0) -1 else 0
}

val num1 = -5
val num2 = 2
val num3 = 0
println("The signum of -5 is " + signum(num1))
println("The signum of 2 is " + signum(num2))
println("The signum of 0 is " + signum(num3))

def countdown(n: Int): Unit = {
var count = n
while (count>=0){
  print(count + "...")
  count = count - 1
}
println()
}

val num4 = 10
countdown(num4)

def prod(s: String): Long ={
  val string = s.toList
  var product:Long = 1
for(elem <- string)
  product = product * elem

product
}

val string1 = "Hello"
val res0 = prod(string1)
println("The product of the characters in \""+string1+"\" is " + res0)

def randomArray(n: Int): Array[Int]= {
  var a: Array[Int] = new Array[Int](n)
  val r = scala.util.Random
  var count = n

  while(count-1>=0)
  {
     a(count-1)= r.nextInt(n)
     count = count - 1
  }
  a
}

println("The Array of n random integers between 0 (inclusive) and n(exclusive): ")
val n = 5
val res1 = randomArray(n).mkString(", ")
println("Array("+res1+")")

def swapAdj(a: Array[Int]): Array[Int] = {
//  val l:ArrayBuffer[int]
  var b:Array[Int] = (for{b <- a.grouped(2)
                         c <- b.reverse
                      } yield c).toArray

b
}
var swap1:Array[Int] = Array(1,2,3,4,5)
var swap2 = swapAdj(swap1)
val res2 = swap1.mkString(", ")
val res3 = swap2.mkString(", ")
println("Lets swap adjacent elements in Array("+res2+"): ")
println("Array("+res3+")")

def positiveNegative(a: Array[Int]): Array[Int] = {

var positive:Array[Int] = for{elem <- a
                              if(elem > 0)
                            } yield elem
var negative:Array[Int] = for{elem <- a
                              if(elem <=0)
                            } yield elem
val posNeg:Array[Int] = positive ++ negative

posNeg
}

var posNeg1:Array[Int] = Array(0,1,-1,2,-2,-3,3)
var posNeg2 = positiveNegative(posNeg1)
val res4 = posNeg1.mkString(", ")
val res5 = posNeg2.mkString(", ")
println("Lets separate positive and negative elems in Array("+res4+")")
println("Array("+res5+")")
    }
}
