package `kotlin dsa`.linked_lists.singly_linked_list

/**
 * Class representing a node
 * @param data The data value held by the node.
 * @property next Reference to the next node in the list.
 */
class Node<T>(val data:T) {
    var next: Node<T>? = null // Reference to the next node (initialized as null)
}
