package examples.`interface`

interface Table {
    @JvmDefault
    fun rows() = 0
}

class BigTable: Table