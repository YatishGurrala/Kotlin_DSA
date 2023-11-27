# Classes in Kotlin

## Overview

Classes in Kotlin serve as fundamental blueprints for creating objects, encapsulating data, and defining behavior. They represent templates or molds from which objects—instances of those classes—are created.

### Key Aspects:

- **Properties:** Classes define attributes or properties that characterize their instances. These properties can hold data.

- **Methods:** They encapsulate behaviors or actions that objects of a class can perform. Methods can manipulate the class's properties.

- **Inheritance:** Kotlin classes support inheritance, enabling the creation of new classes (subclasses) that inherit properties and behaviors from existing classes (superclasses).

- **Abstraction:** Kotlin allows the creation of abstract classes and interfaces, providing blueprints for other classes to implement certain methods or properties.

### Benefits:

- **Modularity:** Classes allow for the organization of code into reusable and manageable components, enhancing maintainability.

- **Code Reusability:** Once a class is defined, multiple objects can be created from it, promoting code reuse and reducing redundancy.

- **Structuring Complexity:** Classes aid in modeling real-world entities, abstract concepts, or complex systems in a more structured and understandable manner.

we will go more detailed later courses

### Example:

```kotlin
// Example of a simple class representing a Car
class Car(val brand: String, var year: Int) {
    // Properties: brand and year
    
    // Method to start the car
    fun startEngine() {
        println("$brand - Engine started")
    }
    
    // Method to accelerate
    fun accelerate(speed: Int) {
        println("$brand - Accelerating at $speed km/h")
    }
}