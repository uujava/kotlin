// WITH_REFLECT

abstract class Outer {

    inner class FirstInner {
        inner class SecondInner<A> {
            inner class ThirdInnner {
                inner class FourthInner

                fun foo(): FourthInner = TODO()
            }
        }
    }
}

fun box(): String {
    Outer.FirstInner.SecondInner.ThirdInnner::class.java.declaredMethods.single { it.name == "foo" }.toGenericString()

    return "OK"
}
