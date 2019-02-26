package examples.demo

import java.util.*

fun funWithDefaults(
    name: String,
    surname: String,
    nickname: String? = "${surname}_$name",
    id: String? = UUID.randomUUID().toString(),
    test: String
) {
    println("nickname is $nickname; id=$id")
}
