package examples.slides

fun String.whoIsAwesome(): String = "Kotlin is awesome ^_^"

fun String.spaceTo(char: Char): String {
    return this.replace(' ', char)
}

fun extensionTest() {
    println("Some string".whoIsAwesome())

    println("Some string".spaceTo('_'))
}