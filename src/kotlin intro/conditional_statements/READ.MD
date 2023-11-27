# Conditional Statements in Kotlin

This topic is about a use of conditional statements in kotlin programming language

## What are Conditional Statements?

Conditional statements are fundamental programming structures that allow the execution of different code blocks based on certain conditions. In Kotlin, the main conditional statements are:

- `if` statement: It executes a block of code if a specified condition is true.
- `else if` statement: It allows checking for additional conditions if the initial `if` condition is false.
- `else` statement: It catches all cases not covered by the preceding conditions.

## Example

Here's an example demonstrating the use of conditional statements in Kotlin:

```kotlin
fun main() {
    val number = 10

    if (number > 0) {
        println("The number is positive")
    } else if (number < 0) {
        println("The number is negative")
    } else {
        println("The number is zero")
    }
}
