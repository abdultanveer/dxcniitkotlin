package basics

class Nullable {
}

fun main() {
    var name : String = "my name is"
    val s2 : String? = "can be null or not"
    s2?.length //compiler will check for nullability
    name.length

}