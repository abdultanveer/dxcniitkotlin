package classes

fun rentPrice(normalDay : Int, festiveDays : Int){
    val dayRates = object {//in java anonymous inner class
        var standard: Int = 30;
        var festive: Int = 50
    }

    val total = dayRates.standard * normalDay + dayRates.festive * festiveDays
    println("Total price = $total")
}
fun main() {
    rentPrice(10,2)
}