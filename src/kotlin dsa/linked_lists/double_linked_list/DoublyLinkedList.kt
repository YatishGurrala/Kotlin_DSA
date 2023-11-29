package `kotlin dsa`.linked_lists.double_linked_list

/**
 * Doubly Linked List implementation.
 * @param T Type of elements to be stored in the linked list.
 */
class DoublyLinkedList<T> {
    private var head: Node<T>? = null // Reference to the first node in the list
    private var tail: Node<T>? = null // Reference to the last node in the list
    private var size: Int = 0 // Size of the linked list

    /**
     * Adds a new node at the beginning of the list.
     * @param data The data value to be added to the list.
     */
    fun prepend(data: T) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            newNode.next = head
            head?.prev = newNode
            head = newNode
        }
        size++
    }

    /**
     * Adds a new node at the end of the list.
     * @param data The data value to be added to the list.
     */
    fun append(data: T) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            tail?.next = newNode
            newNode.prev = tail
            tail = newNode
        }
        size++
    }
    /**
     * Inserts a new node at a specified position in the linked list.
     * @param data The data value to be inserted.
     * @param position The position in the list where the data should be inserted.
     * @throws IndexOutOfBoundsException if the position is invalid (negative or greater than the size).
     */
    fun insert(data: T, position: Int) {
        if (position < 0 || position > size) {
            throw IndexOutOfBoundsException("Invalid position")
        }
        if (position == 0) {
            prepend(data)
        } else if (position == size) {
            append(data)
        } else {
            val newNode = Node(data)
            var current = head
            var index = 0
            while (index < position - 1) {
                current = current?.next
                index++
            }
            newNode.next = current?.next
            newNode.prev = current
            current?.next?.prev = newNode
            current?.next = newNode
            size++
        }
    }
    /**
     * Displays the elements of the linked list.
     */
    fun display() {
        var current = head
        print("Linked List: ")
        while (current != null) {
            print("${current.data} <-> ")
            current = current.next
        }
        println("null")
    }

    /**
     * Gets the size of the linked list.
     * @return The number of elements in the linked list.
     */
    fun getSize(): Int {
        return size
    }


    /**
     * Removes the first node from the linked list.
     */
    fun removeFirst() {
        if (head != null) {
            head = head?.next
            head?.prev = null
            if (head == null) {
                tail = null
            }
            size--
        }
    }

    /**
     * Removes the last node from the linked list.
     */
    fun removeLast() {
        if (tail != null) {
            tail = tail?.prev
            tail?.next = null
            if (tail == null) {
                head = null
            }
            size--
        }
    }

    /**
     * Removes a node at a specified position from the linked list.
     * @param position The position of the node to be removed.
     * @throws IndexOutOfBoundsException if the position is invalid (negative or greater/equal to the size).
     */
    fun removeAt(position: Int) {
        if (position < 0 || position >= size || head == null) {
            throw IndexOutOfBoundsException("Invalid position")
        }
        if (position == 0) {
            removeFirst()
        } else if (position == size - 1) {
            removeLast()
        } else {
            var current = head
            var index = 0
            while (index < position) {
                current = current?.next
                index++
            }
            current?.prev?.next = current?.next
            current?.next?.prev = current?.prev
            size--
        }
    }
}