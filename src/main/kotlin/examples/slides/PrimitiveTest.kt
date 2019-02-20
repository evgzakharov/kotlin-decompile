package examples.slides

val intValue: Int = 0

fun doStaff(value: Int) {}

fun doStaffNullable(value: Int?) {}

fun <T> genericStaff(value: T): T = value

fun testGeneric(): Int = genericStaff(3)

