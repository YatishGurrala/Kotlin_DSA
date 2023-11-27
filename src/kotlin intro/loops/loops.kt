fun forLoopExample() {
    // For loop iterating over a range
    println("For Loop:")
    for (i in 1..3) {
        println(i)
    }
}

fun whileLoopExample() {
    // While loop decrementing x until it's less than or equal to 0
    println("\nWhile Loop:")
    var x = 10
    while (x > 0) {
        println(x)
        x--
    }
}

fun doWhileLoopExample() {
    // Do-while loop decrementing y until it's less than or equal to 0
    println("\nDo-While Loop:")
    var y = 10
    do {
        println(y)
        y--
    } while (y > 0)
}
fun infiniteWhileLoopExample() {
    // Cautionary example of an infinite while loop
    println("\nCautionary Infinite While Loop:")
    var z = 10
    while (z <= 100) {
        println("z: $z") // Print the value of z in each iteration
        z++
    }
}

fun breakContinueExample() {
    // Example demonstrating break and continue in a loop
    println("\nBreak and Continue Example:")
    for (i in 1..5) {
        if (i == 3) {
            continue // Skips the iteration when i is 3
        }
        if (i == 5) {
            break // Exits the loop when i is 5
        }
        println(i)
    }
}

fun main() {
    forLoopExample()
    whileLoopExample()
    doWhileLoopExample()
//    infiniteWhileLoopExample()
    breakContinueExample()
}
