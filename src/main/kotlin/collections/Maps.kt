package collections

class Maps {
}
val passedStudents: MutableMap<Int,String> = mutableMapOf();

fun main() {
    passedStudents.put(1,"abdul");
    passedStudents.put(2,"chandra")
    println(passedStudents)
    println(passedStudents.keys)
    //add a filter, print the name starting with a
}