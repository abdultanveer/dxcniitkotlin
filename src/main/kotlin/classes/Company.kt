package classes

class Company {
    var news: String = "company is launching a new product"
    companion object Media {
        fun broadcastNews(){ //static method
            println("company news")
        }
    }
}

fun main() {
    Company.broadcastNews()
}