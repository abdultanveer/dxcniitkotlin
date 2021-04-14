package classes

enum class State { IDLE, CALLING, ANSWERED, RINGING}

fun main() {
    val state = State.CALLING
    val message =
        when(state){
            State.IDLE -> "its idle"
            State.CALLING -> "calling phone"
            else -> "nothing happening"
        }
    println(State.ANSWERED.ordinal)
}