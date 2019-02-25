package examples.demo

fun collectionTest() {
    val values = listOf("1")

    val resultMap = values
        .filter { it.length > 1 }
        .map { it.toString() }
        .map { it.toString() + "__" }
}