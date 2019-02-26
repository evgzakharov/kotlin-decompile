package examples.demo

open class Foo {
    open fun foo(bar: Int = 0, baz: Int) {
        println("foo bar=$bar baz=$baz")
    }
}

class Blah: Foo() {
    override fun foo(bar: Int, baz: Int) {
        println("blah bar=$bar baz=$baz")
    }
}

fun main() {
    Foo().foo(baz = 3)

    Blah().foo(bar = 5, baz = 3)
}
