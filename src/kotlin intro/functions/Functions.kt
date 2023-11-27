fun main() {
    // Basic function with parameters and no return type
    fun greet(name: String) {
        println("Hello, $name!")
    }

    // Function with default parameter and return type
    fun greetWithMessage(name: String, message: String = "Welcome"): String {
        return "$message, $name!"
    }
    // Usage examples
    greet("Alice") // Output: Hello, Alice!
    println(greetWithMessage("Bob", "Good morning")) // Output: Good morning, Bob!
}

