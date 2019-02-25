package examples.demo

fun kollectionTest() {
    val collectionTest = listOf("1")

    val resultMap = collectionTest
        .filter { it.length > 1 }
        .map { it.toString() }
        .map { it.toString() + "__" }
}