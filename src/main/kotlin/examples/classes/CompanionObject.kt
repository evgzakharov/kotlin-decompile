package examples.classes

class Person {
    fun data() = storeData()

    companion object Store {
        @JvmStatic
        fun storeData(): Int = 100500
    }
}