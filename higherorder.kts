fun calculation(x : Int, y: Int, operation : (Int , Int) -> Int) : Int {

    return operation(x,y)
}

val addition = {x : Int, y : Int -> x + y }
val resultAddition = calculation(4, 5, addition)

val multiplication = {x : Int, y : Int -> x * y }
val resultMultiplication = calculation(4, 5, multiplication)

print(resultAddition)
print(resultMultiplication)
