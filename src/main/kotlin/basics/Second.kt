package basics

class Second {
}

fun main() {
    var a = 1;
    var name = "abdul $a is abdul going"
    var age = 123
    var sentence = "${name.replace("abdul","ansari")}"
    //println(sentence)
    //name = "ansari"
    //print("hello world")
    //println(minOfNumbers(10,20))
        //maxOfNumbers(10,20))

    val students = listOf("nitigna","chandra shekar","gayathri")
    //print if its nitigna -> she's from ap
    //gayathri -> she's from karnataka

    when{
        "nitigna" in students -> println("she's from ap")
        "gayathri" in students -> println("she's from karnataka")
    }

    //for (item in items){ println(item)}
    var index = 0
    while (index < students.size){
        println("${students[index]} is at $index")
        index++
    }
    /*for (index in items.indices){
        //println("item at $index is ${items[index]}")
        println("${items[index]} is at $index")
    }*/
}

fun maxOfNumbers(a:Int, b: Int):Int {
    if(a > b) return a
    else return b;
}
fun minOfNumbers(a: Int, b: Int):Int{
    //if a<b then return a else return b
    if(a<b) return a
    else return b
}