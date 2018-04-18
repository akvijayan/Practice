/**
  * Created by knoldus on 5/4/18.
  */
case class Book(title: String, authors: List[String])
class Example {

  val books:List[Book] = List(
    Book(title = "kids watching", authors = List("Aavik","Arjun"))
  )

  for{
    book <- books
    name <- book.authors
    if name.startsWith("Aavik")
  } yield book.title

  books.flatMap(book => {
    book.authors.withFilter(name => {
      name.startsWith("Aavik")
    }).map(name => {
      book.title
    })
  })

  books flatMap(book =>
    book.authors filter(name => name startsWith("Aavik")) map(_ => book.title))
}
