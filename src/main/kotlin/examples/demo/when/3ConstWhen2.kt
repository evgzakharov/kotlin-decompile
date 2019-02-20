package examples.demo.`when`

const val ZERO_CONST = 1
const val ONE_CONST = 2

fun trueConstWhen(x: Int): String = when(x) {
    ZERO_CONST -> "zero"
    ONE_CONST -> "one"
    else -> "many"
}