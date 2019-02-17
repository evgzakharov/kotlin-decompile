package examples.decompile

fun main() {
    val index: Int = 1
    var mutIndex: Int = 1

    call {
        println(index)
    }

    call {
        mutIndex += 1
    }
}

fun call(action: () -> Unit) {
    action()
}