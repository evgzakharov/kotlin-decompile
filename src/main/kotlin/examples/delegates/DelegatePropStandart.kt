package examples.delegates

import kotlin.properties.Delegates

val lazyValue: Int by lazy { 5 }

val observableValue: Int by Delegates.observable(5) { property, oldValue, newValue ->
    newValue
}

val mapValue: Int by HashMap<String, Int>()