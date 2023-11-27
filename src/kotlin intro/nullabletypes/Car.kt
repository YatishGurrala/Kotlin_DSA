class Car(val brand: String) {
    fun startEngine() {
        println("$brand's engine started!")
    }
}

fun main() {
    // Nullable car
    var car: Car? = Car("Mercedes-Benz")
//Try changing the car value to null and check the output like this
//    var car: Car? = null


    // Safe call operator (?.)
    car?.startEngine() // If car is not null, start the engine
    // Output: Mercedes-Benz's engine started!

    // Elvis operator (?:)
    val realCar = car ?: Car("Porsche") // If car is null, create a Porsche
    realCar.startEngine()
    // Output: Mercedes-Benz's engine started! (if car was not null)

    // Safe cast operator (as?)
    val maybeCar: Any = "Toyota"
    val carInstance: Car? = maybeCar as? Car // Safely try to cast to Car
    carInstance?.startEngine() // Doesn't start the engine as maybeCar is not a Car

    // Not-null assertion (!!)
    val nonNullCar = car!!
    nonNullCar.startEngine()
    // Output: Mercedes-Benz's engine started! (if car was not null)

    // Function demonstrating multiple operators
    fun getCarBrand(car: Car?): String {
        return car?.brand ?: "Unknown" // Return brand or "Unknown" if car is null
    }

    val brand1 = getCarBrand(car)
    println("Brand 1: $brand1") // Output: Brand 1: Mercedes-Benz

    val brand2 = getCarBrand(null)
    println("Brand 2: $brand2") // Output: Brand 2: Unknown
}
