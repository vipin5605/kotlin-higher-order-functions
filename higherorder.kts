// Example 1

fun calculation(x : Int, y: Int, operation : (Int , Int) -> Int) : Int {

    return operation(x,y)
}

val addition = {x : Int, y : Int -> x + y }
val resultAddition = calculation(4, 5, addition)

val multiplication = {x : Int, y : Int -> x * y }
val resultMultiplication = calculation(4, 5, multiplication)

print(resultAddition)
print(resultMultiplication)


// Example 2 - Higher-order functions with receiver (also known as extension function literals with receiver) 

data class Person(val name: String, val age: Int)

fun Person.printDetails() {
    println("Name: $name, Age: $age")
}

val person = Person("John Doe", 30)
person.printDetails() // Output: Name: John Doe, Age: 30
