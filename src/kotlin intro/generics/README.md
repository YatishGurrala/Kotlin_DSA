# Kotlin Generics Examples

This topic covers examples and explanations showcasing the usage of generics in Kotlin. Generics provide a way to write flexible and reusable code that can work with different data types.

## Introduction

Generics in Kotlin offer a powerful toolset for writing adaptable code that operates on various data types while ensuring type safety. This repository aims to illustrate the versatility and practical application of generics in Kotlin programming.

## Examples Covered

### 1. Generic Classes
Generics in classes allow you to create classes that can work with any type. For example:
```kotlin
 class MyClass<T> {
    // Class body
}
```
- **class MyClass< T >:** declares a class with a generic type parameter T

### 2. Functions with Generic Parameters
Functions can also be made generic, enabling them to work with multiple types. For instance:

```kotlin
fun <T> myFunction(item: T) {
    // Function body
}
```
- **fun`<T>`:** declares a function with a generic type parameter `T`.

- **item:** `T` means the function takes a parameter named `item` of type `T`.

### 3. Constraints on Generic Types
```kotlin
 fun <T : Number> myFunction(item: T) {
    // Function body
}
```
`T` : `Number` is a constraint ensuring `T` must be a subtype of Number.

### 4. Variance in Generics

- Examples illustrating covariance, contravariance, and invariance in generic types.
- the out and in modifiers are used to indicate variance in generic types. Variance defines how subtyping between more complex types relates to subtyping between their components.

####Covariance (out) Example:
Covariance is denoted by `out` and allows a type parameter to be used as the return type of functions within the class, enabling the production of instances of that type.
```kotlin
class CovariantHolder<out T>(private val item: T) {
    fun getItem(): T {
        return item
    }
}
```
`CovariantHolder<out T>` defines a covariant type parameter `T`

`getItem()` function returns the stored `item`, allowing the production (`out`) of values of type `T`.

####Contravariance (`in`) Example:
Contravariance is denoted by `in` and allows a type parameter to be used as the parameter type of functions within the class, enabling the consumption of instances of that type.

```kotlin
class ContravariantHolder<in T> {
fun setItem(item: T) {
// Some operation with the item
}
}
```
`ContravariantHolder<in T>` defines a contravariant type parameter T

`setItem(item: T)` function takes an input of type `T`, allowing the consumption (`in`) of values of type `T`.
### 5. Reified Type Parameters

Reified type parameters are used in inline functions to access type information at runtime. For instance:

- Demonstrations using `reified` type parameters in inline functions to access types at runtime.

```kotlin
inline fun <reified T> checkType(value: Any) {
    // Function body
}
```
The `reified T` allows accessing the type `T` at runtime within the function.

