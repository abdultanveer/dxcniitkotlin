package collections

class filter {
}
val nos = listOf<Int>(1,2,-3,4,-5,-7,-9)
val evenOdd = nos.partition { it %2 == 0 }

val words = listOf<String>("first","element","of","found","the","list","last")
fun main() {
    println("even nos are ${evenOdd.first}")
    println("odd nos are ${evenOdd.second}")

    println("${nos.count()}digits are there")
    println("${nos.count { it % 2 == 0 }} even nos are there")

    val first = words.find { it.startsWith("f") }
    println(first)
    val last = words.findLast { it.startsWith("f") }
    println(last)
    val firstNo = nos.first()
    val lastNo = nos.last()
    println("first of nos = $firstNo, last of nos = $lastNo")
    val firstEvenNo = nos.first { it % 2 == 0 }
    val lastEvenNo = nos.last { it % 2 == 0 }
    println("first even no = $firstEvenNo, last even no = $lastEvenNo")



    val positives = nos.filter { it > 0}
            //x -> x>0 }
    println(positives)
    val doubles = nos.map { x -> x*2 }
    println("doubles = $doubles")
    println("is any of the no is greater than 2"+nos.any { it > 2 })
    println("are all the nos less than 5" +nos.all { it < 5 })
    println("are none of the nos greater than 5"+ nos.none{it > 5})

}