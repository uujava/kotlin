// WITH_RUNTIME
// PROBLEMS: false

fun foo() {
    listOf(1,2,3).map {<caret>
        println(it)
        Int::toString
    }
}