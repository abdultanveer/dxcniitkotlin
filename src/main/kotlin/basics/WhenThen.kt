package basics

class WhenThen {
}

fun main() {
    println(describe(1))
    println("hello")
    // 1l --- long
    //2 -- not a string
    // something --- unknown
}

fun describe(obj :Any): String {
   return when (obj) {
        1 -> "one"
        "Hello" -> "greeting"
        is Long -> "long no"
        !is String -> "it is not a string"
        else -> "unknown"

    }
}
