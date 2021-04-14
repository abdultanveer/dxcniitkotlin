package classes

enum class Color(val rgb :Int) {
    RED(0xff0000),
    GREEN(0x00ff00),
    BLUE(0x0000ff),
    YELLOW(0xffff00);

    fun containsRed() = (this.rgb and 0xff0000 !=0)
}

fun main() {
    val red = Color.RED
    println(red.containsRed())
    println(Color.BLUE.containsRed())


}