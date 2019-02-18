package examples.slides

inline class Password(val value: String)

fun main() {
    val password = Password("321")

    println(password.value)
    println(password.hashCode())
    println(password.toString())
}