# Singly and Doubly Linked List Implementation in Kotlin

## Overview
This repository contains Kotlin implementations of singly linked lists and doubly linked lists.

### Singly Linked List
A singly linked list is a collection of nodes where each node contains a data value and a reference to the next node in the sequence. The list starts from a `head` node and ends at a `null` pointer.

### Doubly Linked List
A doubly linked list is similar to a singly linked list but with an additional reference to the previous node (`prev`). This allows traversal in both directions.

## Usage
The implementations provide the following functionalities for both types of lists:

### Singly Linked List Methods:
- `append(data)`: Adds a new node at the end of the list.
- `prepend(data)`: Adds a new node at the beginning of the list.
- `insert(data, position)`: Inserts a node at a specific position in the list.
- `removeFirst()`: Removes the first node from the list.
- `removeLast()`: Removes the last node from the list.
- `removeAt(position)`: Removes a node at a specific position in the list.
- `display()`: Displays the elements of the linked list.
- `getSize()`: Returns the size of the linked list.

### Doubly Linked List Methods:
- `append(data)`: Adds a new node at the end of the list.
- `prepend(data)`: Adds a new node at the beginning of the list.
- `insert(data, position)`: Inserts a node at a specific position in the list.
- `removeFirst()`: Removes the first node from the list.
- `removeLast()`: Removes the last node from the list.
- `removeAt(position)`: Removes a node at a specific position in the list.
- `display()`: Displays the elements of the linked list.
- `getSize()`: Returns the size of the linked list.

## Examples
Below is an example demonstrating the usage of both singly linked list and doubly linked list:

```kotlin
// Example usage for Singly Linked List
val singlyList = SinglyLinkedList<Int>()
singlyList.append(1)
singlyList.append(2)
singlyList.prepend(0)
singlyList.display()

// Example usage for Doubly Linked List
val doublyList = DoublyLinkedList<Int>()
doublyList.append(1)
doublyList.append(2)
doublyList.prepend(0)
doublyList.display()
