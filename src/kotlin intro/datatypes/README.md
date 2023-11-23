# Introduction to Data Types and Variables in Kotlin

## Variables

In Kotlin, variables can be classified based on their mutability, scope, and declaration:

1. **Mutable Variables (`var`)**:
   - **Mutable**: Variables declared with `var` keyword are mutable, meaning their values can be changed or reassigned after initialization.
     ```kotlin
     var count: Int = 10
     count = 15 // Valid - Reassigning the value of 'count'
     ```
   - **Usage**: Use `var` when the value of the variable needs to change during the program execution.

2. **Immutable Variables (`val`)**:
   - **Immutable**: Variables declared with `val` keyword are immutable, meaning their values cannot be changed once assigned.
     ```kotlin
     val pi: Double = 3.14
     // pi = 3.14159 // Invalid - 'val' variables cannot be reassigned
     ```
   - **Usage**: Use `val` when the value of the variable remains constant throughout the program execution. It's similar to declaring constants.

## Data Types

In programming, data types are fundamental building blocks that define the kind of data a variable can hold. Kotlin offers several data types to handle different types of information efficiently:

1. **Int (Integer)**
   - **Description**: Represents whole numbers without decimal points.
   - **Example**: `val myInt: Int = 10`
   - **Usage**: Used for storing values like counts, indices, or any whole number.

2. **Double**
   - **Description**: Represents decimal numbers (floating-point numbers).
   - **Example**: `val myDouble: Double = 5.7`
   - **Usage**: Used for storing fractional numbers or values requiring precision.

3. **Boolean**
   - **Description**: Represents two possible values: `true` or `false`.
   - **Example**: `val isTrue: Boolean = true`
   - **Usage**: Used for logical operations, conditions, or Boolean algebra.

4. **Char (Character)**
   - **Description**: Represents a single character, enclosed in single quotes.
   - **Example**: `val myChar: Char = 'A'`
   - **Usage**: Used for holding individual letters, digits, or symbols.

5. **String**
   - **Description**: Represents a sequence of characters, enclosed in double quotes.
   - **Example**: `val myString: String = "Hello, Kotlin!"`
   - **Usage**: Used for storing text or sequences of characters, such as words or phrases.

6. **Array**
   - **Description**: Represents a collection of fixed-size elements of the same type.
   - **Example**: `val myArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)`
   - **Usage**: Used for storing a specific number of elements accessed by their index.

7. **List**
   - **Description**: Represents a collection of elements in a specific order.
   - **Example**: `val myList: List<String> = listOf("apple", "banana", "orange")`
   - **Usage**: Used for storing a variable number of items with read-only access.

8. **Map**
   - **Description**: Represents a collection of key-value pairs.
   - **Example**: `val myMap: Map<Int, String> = mapOf(1 to "One", 2 to "Two", 3 to "Three")`
   - **Usage**: Used for associating keys with corresponding values, allowing retrieval by the key.

Understanding these data types is essential as they form the foundation for handling different kinds of information in Kotlin. Choosing the right data type ensures efficient memory usage and facilitates proper manipulation of data within programs.
