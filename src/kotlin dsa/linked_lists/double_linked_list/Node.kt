package `kotlin dsa`.linked_lists.double_linked_list

/**
 * Class representing a node in a Doubly Linked List.
 * @param data The data value held by the node.
 */
class Node<T>(val data: T)  {
    var prev: Node<T>? = null // Reference to the previous node
    var next: Node<T>? = null // Reference to the next node
}