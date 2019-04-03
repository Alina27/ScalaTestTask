class Book {

  var title: String = "Original title"

}

object Book {
  def main(args: Array[String]): Unit = {

    val harryPotter = new Book()

    println(harryPotter.title)

    harryPotter.title = "Harry Potter and the Philosopher's Stone"
    println(harryPotter.title)

    harryPotter.title = "Harry Potter and the Chamber of Secrets"
    println(harryPotter.title)

    harryPotter.title = "Harry Potter and the Prisoner of Azkaban"
    println(harryPotter.title)

    harryPotter.title = "Harry Potter and the Goblet of Fire"
    println(harryPotter.title)

    harryPotter.title = "Harry Potter and the Order of the Phoenix"
    println(harryPotter.title)

    harryPotter.title = "Harry Potter and the Half-Blood Prince"
    println(harryPotter.title)

    harryPotter.title = "Harry Potter and the Deathly Hallows"
    println(harryPotter.title)
  }
}

class Movie {
  val title: String = "Original title"
}

object Movie {
  def main(args: Array[String]): Unit = {

    val redemption = new Movie()
    println("Movie title is: " + redemption.title)

    //will be error because redemption.title is val
    //redemption.title = "Shawshank Redemption"

  }
}
