package examples.demo.`when`

val ZERO = 0
val ONE = 1
val TWO = 2

fun constWhen(x: Int): String = when(x) {
    ZERO -> "zero"
    ONE -> "one"
    TWO -> "two"
    else -> "many"
}