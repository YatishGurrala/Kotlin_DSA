# Kotlin Scope Functions

Scope functions in Kotlin are a set of functions that enable concise manipulation of objects within specific contexts, simplifying code and enhancing readability.

## Overview

Kotlin offers five main scope functions: `let`, `run`, `with`, `apply`, and `also`. Each function has a unique purpose, usage, and return value, allowing developers to interact with objects in different ways.

### 1. `let`

- **Purpose:** Executes a block of code on a non-null object.
- **Usage:** Useful for performing operations on non-null objects safely.
- **Return Value:** Result of the lambda expression.
- **Example:**
  ```kotlin
  val nullableValue: String? = "Hello, Kotlin"
  val length = nullableValue?.let {
      // Perform operations on the non-null value
      it.length
  }
  println("Length of the string or null if null: $length")

## 2. `run`

- **Purpose:** Executes a block of code within the context of an object.
- **Usage:** Accesses and modifies object properties conveniently.
- **Return Value:** Result of the lambda expression.
- **Example:**
  ```kotlin
  val result = Product("Phone", 599.99).run {
    // Access and modify properties of the object
    this.price += 100 // Incrementing the price
    "$name is $$price"
  }
println("Updated product details: $result")

## 3. `with`

- **Purpose:** Performs operations with a receiver object without dot notation.
- **Usage:** Simplifies code when accessing object properties or invoking functions.
- **Return Value:** Result of the lambda expression.
- **Example:**
  ```kotlin
  val area = with(5 * 6) {
    // Perform calculations or operations
    this + 10 // Adding 10 to the calculated area
  }
println("Area: $area")

## 4. `apply`

- **Purpose:** Modifies properties of an object and returns the object itself.
- **Usage:** Useful for setting up configurations or initializing objects.
- **Return Value:** The object itself.
- **Example:**
  ```kotlin
  val config = Configuration("example.com", 8080).apply {
    // Set up the configuration
    host = "newhost.com"
    port = 9090}

## 5. `also`

- **Purpose:** Performs additional actions on an object without changing it.
- **Usage:** Suitable for logging or performing side effects.
- **Return Value:** The object itself.
- **Example:**
  ```kotlin
  val product = Product("Phone", 599.99).also {
    // Perform additional operations without changing the object
    println("New product added: ${it.name} - $${it.price}")
}

