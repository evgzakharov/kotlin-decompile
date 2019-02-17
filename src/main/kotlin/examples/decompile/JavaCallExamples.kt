package examples.decompile

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

object KotlinObject

suspend fun doStaff() {}

fun String.extensionFun(): String = ""

fun main() = runBlocking {
    doStaff()
}

val someProperty: String = "123"

data class Person(val name: String)

class Car(var base: BaseCar): ICar by base {
    fun changeBase(base: BaseCar) {
        this.base = base;
    }
}

class BaseCar(): ICar {
    override fun test() = TODO()
}

interface ICar {
    fun test()
}

fun listTest(): List<String> = listOf("123", "321")