// WITH_REFLECT

abstract class Outer {

    inner class FirstInner {
        inner class SecondInner {
            inner class ThirdInnner {
                inner class FourthInner<A>

                fun <B> foo(): FourthInner<B> = TODO()
            }
        }
    }
}

fun box(): String {
    Outer.FirstInner.SecondInner.ThirdInnner::class.java.declaredMethods.single { it.name == "foo" }.toGenericString()

    return "OK"
}
