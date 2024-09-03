fun main(args: Array<String>) {
    val a : Int = 10000
    println("a apakah identik dengan a atau a === a : "+(a === a ))
    val boxedA : Int? = a
    val anotherBpxedA: Int? = a
    println(" boxedA apakah identik dengan anotherBoxedA atau BoxedA === anotherBoxedA : "+ (boxedA ===anotherBpxedA))
    println("boxedA apakah memiliki nilai yang sama dengan anotherBoxedA atau boxedA == anotherBoxedA : "+ (boxedA == anotherBpxedA))
}