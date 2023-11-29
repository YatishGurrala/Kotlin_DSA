package `kotlin dsa`.linked_lists.double_linked_list

fun main() {
    val linkedList = DoublyLinkedList<Int>()

    linkedList.append(1)
    linkedList.append(2)
    linkedList.append(3)

    println("Initial linked list:")
    linkedList.display()

    linkedList.prepend(0)
    linkedList.display()

    linkedList.insert(4, 2)
    linkedList.display()

    linkedList.removeFirst()
    linkedList.removeLast()
    linkedList.display()

    linkedList.removeAt(1)
    linkedList.display()

    println("Size of the linked list: ${linkedList.getSize()}")
}
