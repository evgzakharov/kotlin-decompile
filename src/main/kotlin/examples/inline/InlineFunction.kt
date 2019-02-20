package examples.inline

inline fun inlineTest(value: String) {
    println("inline method call: $value")
}

fun test() {
    inlineTest("1")
    inlineTest("2")
}