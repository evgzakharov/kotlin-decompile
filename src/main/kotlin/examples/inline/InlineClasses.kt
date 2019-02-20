package examples.inline

inline class Password(val value: String) {
    fun hashValue(): String = "hash: $value"
}

fun main() {
    val password = Password("321")

    println(password.value)
    println(password.hashCode())
    println(password.toString())
    println(password.hashValue())
}