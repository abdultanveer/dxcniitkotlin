package classes

data class User(var name :String,val id :Int)

fun main() {
    val user = User("abdul",1)
    val secondUser = User("abdul",1)

    println(user)
    println(user.name)
    //user.name = "ansari"
    println(user.name)
    println(user==secondUser)
    println(user.hashCode())
    println(secondUser.hashCode())




}