package examples.slides

fun <T> runLambda(action: ()-> T): T = action()

var value = 0
fun noncapLambda(): Int = runLambda { value }
