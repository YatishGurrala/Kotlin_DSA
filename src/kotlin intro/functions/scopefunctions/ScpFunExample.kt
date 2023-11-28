data class Product(var name: String, var price: Double)

class Configuration(var host: String, var port: Int) {
    fun connect() {
        // Connect logic
        println("Connected to $host on port $port")
    }
}

fun calculateArea(length: Int, width: Int): Int {
    return with(length * width) {
        // Perform calculations or operations
        this + 10 // Adding 10 to the calculated area
    }
}

fun main() {
    // Example of using 'let' function
    val nullableValue: String? = "Hello, Kotlin"
    val length = nullableValue?.let {
        // Perform operations on the non-null value
        it.length
    }
    println("Length of the string or null if null: $length")

    // Example of using 'run' function
    val result = Product("Phone", 599.99).run {
        // Access and modify properties of the object
        this.price += 100 // Incrementing the price
        "$name is $$price"
    }
    println("Updated product details: $result")

    // Example of using 'with' function
    val area = calculateArea(5, 6)
    println("Area: $area") // 'area' will be 40 (5 * 6 + 10)

    // Example of using 'apply' function
    val config = Configuration("example.com", 8080).apply {
        // Set up the configuration
        host = "newhost.com"
        port = 9090
    }
    config.connect() // Outputs: Connected to newhost.com on port 9090

    // Example of using 'also' function
    val product = Product("Phone", 599.99).also {
        // Perform additional operations without changing the object
        println("New product added: ${it.name} - $${it.price}")
    }
    // 'product' remains unchanged, but it gets printed: "New product added: Phone - $599.99"
}
