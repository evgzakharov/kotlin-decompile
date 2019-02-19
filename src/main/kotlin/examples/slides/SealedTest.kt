package examples.slides

sealed class SealedClass

object SealedObject: SealedClass()

class SealedSubClass: SealedClass()