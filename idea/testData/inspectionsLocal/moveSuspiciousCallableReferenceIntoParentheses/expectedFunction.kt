// WITH_RUNTIME
// PROBLEMS: false

fun foo(arg: Int) = arg.toString()

val someFun: (Int) -> String = 42.let { <caret>::foo }