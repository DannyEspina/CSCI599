#Day 5

```scala
case class book (title: String, authors: List[String])

val a1 = Book(title =” scala programming”, List(“Abelson, Hared”, “susssman, Gerald I. “))

val myTitle = a1.title

val myAuthor = a1.authors

// mini database
val books: List[Book] = List(book1, book2, ….)
```


for expression
for( ) yield

1)	Find the titles of books whose author’s name is “Bird” return: List[String]
2)	Find all the books which have the word “Program” in the title
3)	Find the names of all authors who have written at least two books present in the database. (make sure output don’t have duplicate)


controlStruture1
controlStruture2
controlStruture3
hw1
source code
output

Due Tuesday next week

Comparison between functional programming and imperative programming

1)	Introduction
a.	Briefly talks about these two programming approach ( what is functional programing and what is imperative programming)
b.	Why they are different
2)	literative review
a.	read a couple of academic paper for this subject
3)	implematation and analysis
a.	compare major advantages and disadvantage of thee two approaches
b.	why and when people choose one of them
c.	in which situation, you choose what
4)	summery
5)	reference ( citation)
a.	slide, for major points of your paper

font size is 12
times new roman
8-10 pages
1.5 spaces
2-3 academic papers
couple of sources from internet

MyArrays.scala

object MyArrays {
	def main (…) {

fixed length Arrays
if you need an Array whose length doesn’t change, use the Array type in scala.

nums: Array[int] = Array(0,…)
```scala
val nums = new Array[Int](10)
```

arr1: Array[String] = Array(null,…)
```scala
val arr1 = new Array[String](10)
```

create array by calling apply from Array’s comparison object
arr2: Array[String]

```scala
val arr2 = Array(“hello”, “world”)
arr2(0) = “goodbye”
```

variable – length array: Array buffers

java: ArrayList
C++: vector
Both grow and shrink on demand

```scala
import scala.collection.mutable.Arraybuffer
val arr3 = new ArrayBuffer[Int]

//arrayBuffer(1) add on element with +=
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
(1,1,6,2)
arr3.insert(2,6)

//insert as many elements as you like
//(1,1,7,8,9,6,2)
arr3(z, 7, 8, 9)

//remove elements at arbitray  location
//(1,1,8,9,6,2)
arr3.remove(7)

// second parmeter tel how many elements to remove
//(1,1,2)
arr3.remove(2,3)
```

sometimes you want to build up an Array, but you don’t yet know how many elements you will need. In that case, first make an array buffer, then call arr3:Array[Int]
```scala
val arr4 = arr3.toArray

//traverse array and array buffer

val arr5 = Array(1,1,2,3,5,8,13,21,34,55)
for( I <- 0 until arr5.length)
	println(it “:” + arr5(i)
```

visit every second element of array
val stepsize = 4

```scala
for(I <- 0 until (arr5.length, 2))
println(it “:” + arr5(i)
```
