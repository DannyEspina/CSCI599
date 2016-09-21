import scala.collection.mutable.ArrayBuffer

object MyArrays {
	  def main(args: Array[String]):Unit={

val nums = new Array[Int](10)
val arr1 = new Array[String](10)

val arr2 = Array("hello", "world")
arr2(0) = "goodbye"


val arr3 = new ArrayBuffer[Int]

arr3 +=1

//add multiple elements at the end
//(1,1,2,3,5)
arr3 +=(1, 2, 3, 5)

//you  can append any collection with ++= operator
//(1,1,2,3,5,8,13,21)
arr3 ++= Array (8, 13, 21)

//remove last five elements
//(1,1,2)
arr3.trimEnd(5)

//Insert before index 2
//(1,1,6,2)
arr3.insert(2,6)

//insert as many elements as you like
//(1,1,7,8,9,6,2)


arr3.insert(2, 7, 8, 9)  //error: too many arguments for method apply

//remove elements at arbitray  location
//(1,1,8,9,6,2)
arr3.remove(2)

// second parmeter tell how many elements to remove
//(1,1,2)
arr3.remove(2,3)

val arr4 = arr3.toArray

//traverse array and array buffer

val arr5 = Array(1,1,2,3,5,8,13,21,34,55)
println()
println("Prints every element in the Array: ")
for( i <- 0 until arr5.length)
println(i + ":" + arr5(i) )
println()

val stepsize = 4

println("Prints every other element starting at 2: ")
for( i <- 0 until (arr5.length, 2))
println(i + ": " + arr5(i))
println()

println("Prints every elements in reverse: ")
for(i <-  (0 until arr5.length).reverse)
println(i + ": " + arr5(i))
println()

println("Prints out every element in the Array: ")
for (elem <- arr5) println(elem)
println()

val a1 = ArrayBuffer(2,3,5,7,11)

val result1 = for(elem <- a1) yield 2*elem

val result2 = for(elem <-a1 if elem%2 == 0) yield 2*elem

val resultString1 = result1.mkString(", ")
val resultString2 = result2.mkString(", ")
println("result1: " + resultString1)
println()

println("result2: " + resultString2)
println()

def removeAllNegativeExceptTheFirst(a:ArrayBuffer[Int]): Unit= {
	var first = true
	var n = a.length
	var i = 0
	while(i < n){
		if(a(i) >=0) i+=1
		else {
			if(first) {first = false; i+=1}
			else {a.remove(i); n-=1}
		}
	}
	val aString1 = a.mkString(", ")
	println("The array after the removeAllNegativeExceptTheFirst function: ")
	println(aString1)


}
//testing removeAllNegativeExceptTheFirst
val a2 = ArrayBuffer(-1, -2, 3, -4, 5)
val aString2 = a2.mkString(", ")
println("The array before the removeAllNegativeExceptTheFirst function: ")
println(aString2)
println()
removeAllNegativeExceptTheFirst(a2)

def removeAllNegative2(a: ArrayBuffer[Int]): Unit ={
	//get index of all negative numbers
	val indexes = for(i <- 0 until a.length if a(i)<0) yield i

	for(j <-(1 until indexes.length).reverse) a.remove(indexes(j))

	val aString3 = a.mkString(", ")
	println("The array after the removeAllNegative2 function: ")
	println(aString3)

}
//testing removeAllNegative2
val a3 = ArrayBuffer(-1, -2, 3, -4, 5)
println()
val aString4 = a3.mkString(", ")
println("The array before the removeAllNegative2 function: ")
println(aString4)
println()
removeAllNegative2(a3)
println()

val res17 = Array(1, 7, 2, 9).sum
println("sum of Array(1, 7, 2, 9): ")
println(res17)
println()

val res18 = ArrayBuffer("Alary", "had", "a", "little", "lamb").max
println("The max of ArrayBuffer(\"Alary\", \"had\", \"a\", \"little\", \"lamb\"): ")
println(res18)
println()

val b3 = ArrayBuffer(1,7,2,9)
val b3Sorted = b3.sorted
val bString1 = b3.mkString(", ")
val bString2 = b3Sorted.mkString(", ")
println("Array b3 before being sorted: ")
println(bString1)
println()
println("Array b3 after being sorted: ")
println(bString2)
println()

val arr7 = Array(1,7,2,9)
val res19 = arr7.mkString(" and ") //"1 and 2 and 7 and 9"
val res20 = arr7.mkString("<", ",", ">") //"<1,2,7,9>"
println("res19: ")
println(res19)
println("res20: ")
println(res20)
println()

val a = Array(1, -2, 3, -4, 5)
val b = ArrayBuffer(1,7,8,9)
val aString5 = a.mkString(", ")
val bString3 = b.mkString(", ")
println("Array a: ")
println(aString5)
println()
println("Array b: ")
println(bString3)
println()

// counts how many elements of a are positive
val res23 = a.count(_ > 0) // a.count(i => i>0)
println("The total number of positive numbers in a: ")
println(res23)


//1,7,2,9,1,7,2,9
println()
b.append(1,7,2,9)
val bString4 = b.mkString(", ")
println("Array b after appending 1, 7, 2, 9: ")
println(bString4)

//1,7,2,9,1,7,2,9, 1, -2, 3, -4, 5
println()
b.appendAll(a)
val bString5 = b.mkString(", ")
println("Array b after appending all elements of Array a: ")
println(bString5)


//1,2,9,1,7,2,9, 1, -2, 3, -4, 5, 4
println()
b += 4 -= 7
val bString6 = b.mkString(", ")
println("Array b after adding 4 and subtracting 7: ")
println(bString6)


println()
b.copyToArray(a)
val aString6 = a.mkString(", ")
println("Copying the first 5 elements of Array b to Array a: ")
println(aString6)


//1,7,2,9,-1,-1,-1,...,-1
println()
 val bPadTo = b.padTo(20, -1)
 val bString7 = b.mkString(", ")
 println("adds -1 to Array b until the size reaches 20: " )
 println(bString7)



 val matrix = Array.ofDim[Double](2,4)
 val row = 0
 val columns = 3

 // to access an element, we take pairs of parentase
 matrix(row)(columns)= 17.09
 val res24 = matrix.length //num of rows
 val res25 = matrix(row)
 val res26 = matrix(row).length
}
}
