package examples.delegates

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class DelegateTest(base: Int) {
    val value: Int by NewDelegate(base)
}

class NewDelegate(private val base: Int) : ReadOnlyProperty<DelegateTest, Int> {
    override fun getValue(thisRef: DelegateTest, property: KProperty<*>): Int {
        return base * 2
    }
}

