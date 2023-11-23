package `kotlin intro`.datatypes


//In Kotlin Main is the function where we write the code to execute
fun main() {
    // Integer data type
    val myInt: Int = 10
    println("Integer value: $myInt")

    // Double data type
    val myDouble: Double = 5.7
    println("Double value: $myDouble")

    // Boolean data type
    val isTrue: Boolean = true
    println("Boolean value: $isTrue")

    // Character data type
    val myChar: Char = 'A'
    println("Character value: $myChar")

    // String data type
    val myString: String = "Hello, Kotlin!"
    println("String value: $myString")

    // Array data type
    val myArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println("Array values: ${myArray.joinToString()}")

    // List data type
    val myList: List<String> = listOf("apple", "banana", "orange")
    println("List values: $myList")

    // Map data type
    val myMap: Map<Int, String> = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    println("Map values: $myMap")
}
