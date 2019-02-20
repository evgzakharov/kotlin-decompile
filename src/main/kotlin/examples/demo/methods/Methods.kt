package examples.demo.methods

fun testMethod(value: String) = "123"

fun testLambda() {
    val index: Int = 1
    var mutIndex: Int = 1

    call {   //обращение к final полю
        println(index)
    }

    call {   //обращение к mutable полю
        mutIndex += 1
    }
}

fun call(action: () -> Unit) {
    action()
}

data class Person(
    val a: String,
    val a2: String,
    val a3: String,
    val a4: String,
    val a5: String,
    val b: String,
    val b2: String,
    val b3: String,
    val b4: String,
    val b5: String,
    val c: String,
    val c2: String,
    val c3: String,
    val c4: String,
    val c5: String,
    val d: String,
    val d2: String,
    val d3: String,
    val d4: String,
    val d5: String,
    val e: String,
    val e2: String,
    val e3: String,
    val e4: String,
    val e5: String
)