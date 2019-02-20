package examples.demo.`when`

fun trueConstWhen(value: Any): String = when {
    value is String && value == "one" -> "one"
    value is Int && value == 2 -> "two"
    else -> "many"
}