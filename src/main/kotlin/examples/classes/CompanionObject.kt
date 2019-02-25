package examples.classes

class Person {
    fun data() = storeData()

    companion object Store {
        fun storeData(): Int = 100500
    }
}