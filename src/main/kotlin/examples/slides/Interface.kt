package examples.slides

interface InterfaceWithDefaults {
    fun call(): String = "123"
}

class Test: InterfaceWithDefaults {

}
