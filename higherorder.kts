fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

val addition = { x: Int, y: Int -> x + y }
val result = calculate(5, 3, addition) // Result: 8
print(result)
