fun main() {
    val number = 10

    if (number > 0) {
        println("The number is positive")
    } else if (number < 0) {
        println("The number is negative")
    } else {
        println("The number is zero")
    }

    // Using conditional expression
    val result = if (number % 2 == 0) "even" else "odd"
    println("The number is $result")
}
