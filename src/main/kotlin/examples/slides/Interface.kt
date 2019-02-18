package examples.slides

interface InterfaceWithDefaults {
    @JvmDefault
    fun call(): String = "123"
}

