package examples.demo

import java.io.File
import java.lang.RuntimeException
import java.nio.file.FileSystem

inline fun <reified T> printClass(value: T) {
    println(T::class.java.name)
}

fun main() {
    printClass(3)
    printClass("string value")
    printClass(File("/path"))
}