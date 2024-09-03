fun main(args: Array<String>) {
    var charA : Char = 'A'
    //println(charA == 65 )
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())
    var strA : String = charA.toString()
    println(" kini charA sudah menjadi String = " + strA)

}