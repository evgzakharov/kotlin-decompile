package examples.slides

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
