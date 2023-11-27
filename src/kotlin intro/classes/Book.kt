
// Example of a simple class representing a Book
class Book(val title: String, val author: String, var yearPublished: Int) {
    // Properties: title, author, and yearPublished

    // Method to get book details
    fun getBookDetails() {
        println("Title: $title")
        println("Author: $author")
        println("Year Published: $yearPublished")
    }

    // Method to check if the book is a classic based on publishing year
    fun isClassic(): Boolean {
        return yearPublished < 1900
    }
}

fun main() {
    // Creating an instance of the Book class
    val myBook = Book("War and Peace", "Leo Tolstoy", 1869)

    // Accessing properties and invoking methods
    println("My favorite book is '${myBook.title}' by ${myBook.author}")
    myBook.getBookDetails()

    // Checking if the book is a classic
    if (myBook.isClassic()) {
        println("This book is considered a classic!")
    } else {
        println("This book is not considered a classic.")
    }
}
