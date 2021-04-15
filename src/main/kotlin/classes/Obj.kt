package classes

fun rentPrice(normalDay : Int, festiveDays : Int){
    val dayRates = object {
        var standard: Int = 30;
        var festive: Int = 50
    }

    val total = dayRates.standard + dayRates.festive
    println("Total price = $total")
}
fun main() {
    rentPrice(10,2)
}