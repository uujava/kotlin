// WITH_REFLECT

abstract class Outer<S> {
    inner class Inner<R>
    fun <R> foo(): Inner<R>? = null
}

fun box(): String {
    Outer::class.java.declaredMethods.single { it.name == "foo" }.toGenericString()

    return "OK"
}