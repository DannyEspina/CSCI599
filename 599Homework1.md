```scala
case class Book(title: String, authors: List[String])

/*
A Mini-Database

Mini-database uses named arguments, which is clearer
*/
object BookDatabase{
  def main(args:Array[String]):Unit= {
val books: List[Book] = List(
Book(title = "Structure and Interpretation of Computer Programs",
authors = List("Abelson, Harald", "Sussman, Gerald J.")),

Book(title = "Introduction to Functional Programming",
authors = List("Bird, Richard", "Wadler, Phil")),

Book(title = "Effective Java",
authors = List("Bloch, Joshua")),

Book(title = "Effective Java 2",
authors = List("Bloch, Joshua")),

Book(title = "Java Puzzlers",
authors = List("Bloch, Joshua", "Gafter, Neal")),

Book(title = "Scala Cookbook",
authors = List("Alvin Alexander")))


var filteredBooks = for (book <- books.filter(_.authors.filter(_.matches(".*Bird.*")).length > 0)) yield book.title
println()
println("Books whoose author's name is Bird: ")
filteredBooks.foreach(println)
println()

var matchTitles = for(book <- books if book.title.matches(".*Program.*")) yield book.title
println("Books with \"Program\" in the title: ")
matchTitles.foreach(println)
println()


var authorNames=  for {i <- 0 until books.length;
                            j <- i+1 until books.length;
                            k <- 0 until books(i).authors.length;
                            l <- 0 until books(j).authors.length
                            if books(i).authors(k).matches(books(j).authors(l))
                            } yield books(i).authors(k)
authorNames=authorNames.distinct

println("Names of all authors who written at least two books: ")
authorNames.foreach(println)
}
}

```
