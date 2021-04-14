package basics

class EqualityCheck {
}

fun main() {
    val listAuthors = setOf<String>("author1","author2")
    val listWriters = setOf<String>("author2","author1")

    println(listAuthors == listWriters)//compare the content of the sets
    println(listAuthors === listWriters) //it'll compare the references[adress]

}