# __Day 2__

#### Advanced For Loops and for comprehension ( Pure functional style )

In Java, for(initialize; text; update), you need to mutate i during the loop.
You can have multiple generators of the form Variable <- expression. Separate them by semicolons.

Second generator run faster than the first generator. The first loop has no mutation.
```scala
for( i <- 1 to 3; j <- i1to 3)
  print((10*i + j) + “ “)
```
The printing result will be: 11, 12, 13, 21, 22, 23, 31, 32, 33

Each generator can have a guard
```scala
for(i <- 1 to 3; j <- 1 to 3 if i != j)
  print((10*i+j)+” “)
```
The printing result will be: 12, 13, 21, 23, 31 32

You can have any number of definition, introducing variables that can be used inside the loop.
```scala
for(i <- 1 to 3; form = 4 – i; j <- from to 3)
	print((10*i+j)+” “)
```
The printing result will be: 13 22 23 31 32 33

For functional style, every construct produce a value. If/else produce a value.

#### For comprehension
```scala
Val res18 = for( i <- 1 to 10) yield i % 3
	//vector (1, 2, 0, 1, 2, 0, 1, 2, 0, 1)
```

1 to 10 is the range. In order to hold value, you need to use the vector.
Vector is a indexed sequence (you can access each element efficiently)
```scala
Range object{start value and value step}
```

The generated collection is compatible with the first generator.
```scala
Val res19 = for( c <- “hello”; i <- 0 to 1) yield (c + i).toChar
```

Final result: Res19 String =”HIeflmlmop”


```scala
val res20 = for( i <- 0 to i; c <- “Hello”) yield (c + i).toChar
```
Final result: res20: Vector( H, e, l, l,  o, I, f, m, m, p)


#### Fucntions (Scala is pure object-oriendted language)

```scala
def abs(x:Double):Double =
if (x >= 0)
  x
else
  –x
```
(x:Double) is the parameter, :Double is the return type and if (x >= 0) x else –x produces a value

For functions, return is rarely used.
```scala
Println(abs(3))
Println(abs(-3))
```

##### Purely imperative style for factorial
`3! = 3 * 2 * 1`
```scala
def fac(n: Int)= {
var r=2; // var allows mutation
for( i <- 1 to n)  r = r*i
  r
}
//The last expression is value at block
println(fac(10))
```
##### Purely functional style for factorial
There is no mutation in this function
```scala
def recurisiveFac(n: Int): Int =
if(n <= 0)
  1
else
  n * recursiveFac(n-1)
```
#### Variable arguments
Sometimes, it is convenient to implement a function that can take a variable number of arguments
```scala
def sum(args: Int*) = {
var result = 0
	for(arg <- args) result += arg
	 result
}
```
(args: Int*) : you can take any number of Int. Single parameter of type Seq (sequence)

You can call this function with as many arguments as you like.
```scala
val result1 = sum (1, 4, 9, 16, 25)
println(result1)

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
```
Prints Hello inside a box

```scala
Def box(s: String): Unit ={
//Unit is like void
val border = “_” * s.length + “--\n”
//“_” * s.length produces s.lenght number of _
println(“\n” + border + “|” + s + “|\n” + border)
}
box(“ferd”)
box(“Wilma”)
```
