// WITH_REFLECT

abstract class Outer {
    inner class Inner
    fun foo(): Inner? = null
}

fun box(): String {
    Outer::class.java.declaredMethods.single { it.name == "foo" }.toGenericString()

    return "OK"
}