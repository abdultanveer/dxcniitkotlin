package collections

class filter {
}
val nos = listOf<Int>(1,2,-3,4,-5,-7,-9)
fun main() {
    val positives = nos.filter { it > 0}
            //x -> x>0 }
    println(positives)
}