package examples.demo

import java.io.File
import java.lang.RuntimeException
import java.nio.file.FileSystem

inline fun <reified T> selfClass(): Class<T> = T::class.java

fun main() {
    println(selfClass<File>())
    println(selfClass<String>())
    println(selfClass<Thread>())

    val fileSystemClass: Class<FileSystem> = selfClass()
    println(fileSystemClass)
}