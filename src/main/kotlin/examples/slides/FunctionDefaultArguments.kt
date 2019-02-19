package examples.slides

import java.util.*

fun funWithDefaults(
    name: String,
    surname: String,
    nickname: String? = "${surname}_$name",
    id: String? = UUID.randomUUID().toString()
) {
    println("nickname is $nickname; id=$id")
}

fun testCall() {
    funWithDefaults("", "")
}