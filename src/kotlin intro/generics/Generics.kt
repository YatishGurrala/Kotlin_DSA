// Generic class
class Box<T>(val item: T)

// Function with a generic parameter
fun <T> printItem(item: T) {
    println(item)
}

// Function with a constraint on the generic type
fun <T : Number> performOperation(value: T) {
    println("Performing operation on $value")
}

// Covariant, Contravariant, and Invariant examples
class Producer<out T>(val item: T) {
    fun produce(): T {
        return item
    }
}

class Consumer<in T> {
    fun consume(item: T) {
        println("Consuming $item")
    }
}
// Inline function with a reified type parameter
inline fun <reified T> checkType(value: Any) {
    if (value is T) {
        println("Value has type T")
    } else {
        println("Value does not have type T")
    }
}

fun main() {
    // Using generic class
    val intBox = Box(10)
    val stringBox = Box("Hello")

    println(intBox.item)    // Prints 10
    println(stringBox.item) // Prints Hello

    // Using generic function
    printItem(5)    // Prints 5
    printItem("Hi") // Prints Hi

    // Using generic function with constraint
    performOperation(15) // Prints Performing operation on 15
    // performOperation("String") // This line won't compile due to type constraint

    // Covariant, Contravariant, and Invariant examples
    val producer: Producer<Number> = Producer(10.5)
    val number: Number = producer.produce()
    println("Produced number: $number") // Prints 10.5

    val consumer: Consumer<Int> = Consumer()
    consumer.consume(5) // Prints Consuming 5
    // consumer.consume("String") // This line won't compile due to type constraint

    // Reified type example
    checkType<String>("Hello") // Prints Value has type T
    checkType<Int>(10.5)      // Prints Value does not have type T
}
