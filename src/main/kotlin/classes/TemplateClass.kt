package classes

import java.util.*

object  TemplateClass {
    fun getNumber(){
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun main() {
    val t1 = TemplateClass.getNumber()
    val t2 = TemplateClass.getNumber()



   // t1.getNumber()//get no is an instance method
   // t2.getNumber()
}