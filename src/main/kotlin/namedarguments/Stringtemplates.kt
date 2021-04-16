package namedarguments

class Stringtemplates {
}

fun main() {
    val (x,y,z) = arrayOf(5,10,15)
    val map = mapOf( "abdul" to 21, "nitigna" to 12)
    for((name,age) in map){
        println("$name in $age")
    }
    //val (min,max) = findMinMax(listOf(5,19,15))
    println(x)
    val greeting = "welcome"
    println("$greeting to java")
    println("${greeting.toUpperCase()} to java")
}

fun findMinMax(listOf: List<Int>): Any {
    return 0

}
