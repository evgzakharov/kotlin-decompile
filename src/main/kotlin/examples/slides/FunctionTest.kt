package examples.slides

fun publicFun(value: String) {
    println(value.length)
}

private fun privateFun(value: String) {
    println(value.length)
}


fun bigPublicFun(value: String, value2: String, value3: String) {
    println("$value; $value2; $value3")
}