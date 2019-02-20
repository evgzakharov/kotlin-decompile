package examples.demo

import java.lang.RuntimeException

tailrec fun factorial(value: Int, multiply: Int = 1): Int {
    if (value < 0)
        throw RuntimeException("value=$value < 0")

    if (value == 0 || value == 1) {
        return multiply
    }

    return factorial(value - 1, value * multiply)
}

fun main() {
    println(factorial(1))
    println(factorial(2))
    println(factorial(3))
    println(factorial(4))
}