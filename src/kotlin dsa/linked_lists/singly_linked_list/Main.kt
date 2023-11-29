package `kotlin dsa`.linked_lists.singly_linked_list

fun main() {
    val linkedList = SinglyLinkedList<Int>()

    linkedList.append(1)
    linkedList.append(2)
    linkedList.append(3)

    println("Initial linked list:")
    linkedList.display() // Display the elements in the linked list

    linkedList.prepend(0) // Add a node at the beginning
    linkedList.display()

    linkedList.insert(4, 4) // Insert at a specific position
    linkedList.display()

    linkedList.removeFirst() // Remove the first element
    linkedList.removeLast() // Remove the last element
    linkedList.display()

    linkedList.removeAt(1) // Remove element at a specific position
    linkedList.display()

    println("Size of the linked list: ${linkedList.getSize()}") // Get the size of the linked list
}

