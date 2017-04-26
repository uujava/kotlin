// WITH_REFLECT

abstract class Outer {
    inner class Inner<R>
    fun <R> foo(): Inner<R>? = null
}

fun box(): String {
    Outer::class.java.getDeclaredMethods().single { it.name == "foo" }.toGenericString()

    return "OK"
}