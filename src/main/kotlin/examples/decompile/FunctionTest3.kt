package examples.decompile

fun <T> runLambda(x: () -> T): T = x()

val value = 0

fun noncapLambda(): Int = runLambda { value }

fun capturingLambda(v: Int): Int = runLambda { v }
