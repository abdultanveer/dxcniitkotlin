package delegation

interface SoundBehaviour{
    fun makeSound()
}
class ScreamBehaviour (val scream: String):SoundBehaviour {
    override fun makeSound() {
        println(scream.toUpperCase())
    }
}
class Singer(val song: String):SoundBehaviour by ScreamBehaviour(song){
//i am not implementing makeSoung of SoundBehaviour instead
    //i am delegating makeSound to ScreamBehaviour class
}

fun main() {
    val singer = Singer("some song")
    singer.makeSound()

}

class Delegation {
}