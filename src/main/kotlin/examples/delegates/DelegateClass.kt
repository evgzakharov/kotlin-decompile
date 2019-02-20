package examples.delegates

class Car(var base: BaseCar): ICar by base {}

class BaseCar(): ICar {
    override fun test() = println("test")
}

interface ICar {
    fun test()
}