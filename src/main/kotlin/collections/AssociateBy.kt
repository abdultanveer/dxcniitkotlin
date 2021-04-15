package collections

class AssociateBy {
}
data class Person(val name: String, val city: String, val phone: Int)

val people = listOf<Person>(
    Person("abdul","bangalore",12345),
    Person("chandra","bangalore",12345),

    Person("bapji","hyd",7654),
    Person("yashas","hyd",6789))
fun main() {
    val phoneBook = people.associateBy { it.city }
    println(phoneBook)
}