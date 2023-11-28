fun createImmutableCollections() {
    // Immutable Collections
    val immutableList = listOf("apple", "banana", "orange")
    val immutableSet = setOf("apple", "banana", "orange")
    val immutableMap = mapOf(1 to "One", 2 to "Two", 3 to "Three")

    println("Immutable List: $immutableList")
    println("Immutable Set: $immutableSet")
    println("Immutable Map: $immutableMap")
}

fun manipulateMutableCollections() {
    // Mutable Collections
    val mutableList = mutableListOf("apple", "banana", "orange")
    val mutableSet = mutableSetOf("apple", "banana", "orange")
    val mutableMap = mutableMapOf(1 to "One", 2 to "Two", 3 to "Three")

    println("Mutable List (Before Operations): $mutableList")
    println("Mutable Set (Before Operations): $mutableSet")
    println("Mutable Map (Before Operations): $mutableMap")

    // Manipulating mutable collections
    mutableList.add("grape")
    mutableList.removeAt(1)

    mutableSet.add("banana")
    mutableSet.remove("orange")

    mutableMap[4] = "Four"
    mutableMap.remove(2)

    println("Mutable List (After Operations): $mutableList")
    println("Mutable Set (After Operations): $mutableSet")
    println("Mutable Map (After Operations): $mutableMap")
}

fun main() {
    createImmutableCollections()
    manipulateMutableCollections()
}
