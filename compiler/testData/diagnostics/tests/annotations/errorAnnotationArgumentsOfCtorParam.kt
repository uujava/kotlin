@Target(AnnotationTarget.FIELD)
annotation class Anno

class TestAnn(@Anno(<!UNRESOLVED_REFERENCE, TOO_MANY_ARGUMENTS!>BLA<!>) val s: Int)

class TestDeprecatedWithoutArguments(@<!NO_VALUE_FOR_PARAMETER!>Deprecated<!> val s: Int)