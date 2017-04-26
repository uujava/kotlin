// WITH_REFLECT

abstract class Outer {

    inner class FirstInner {
        inner class SecondInner<A> {
            inner class ThirdInnner {
                inner class FourthInner<B>

                fun <C> foo(): FourthInner<C> = TODO()
            }
        }
    }
}

fun box(): String {
    Outer.FirstInner.SecondInner.ThirdInnner::class.java.declaredMethods.single { it.name == "foo" }.toGenericString()

    return "OK"
}
