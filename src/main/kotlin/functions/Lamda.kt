package functions

class Lamda {
}

@ExperimentalStdlibApi
fun main() {
    val name: String
    val upperCase1 : (String) -> String = {str: String -> str.toUpperCase()}
    val upperCase2: (String) -> String ={str -> str.toUpperCase()}
    val upperCase3 = {str: String -> str.toUpperCase()}
    //val uppercase4 = {str -> str.toUpperCase()}
    val upperCase5: (String) -> String = {it.toUpperCase()}//when method has only one param
    val upperCase6: (String) -> String = String::uppercase
    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))


}