package examples.demo

data class Point3D(val x: Long, val y: Long, val z: Long)

data class Point3DCustom(val x: Long, val y: Long, val z: Long) {
    override fun toString(): String {
        return "Rewrite Point3DCustom(x=$x, y=$y, z=$z)"
    }
}