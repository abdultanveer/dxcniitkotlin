package basics

class Rectangle(var height :Int, width :Int){
    var perimeter = 2 * (height+width)
}

fun main(){
    var rectangle = Rectangle(5,6)
    println("perimeter of rectangle is ${rectangle.perimeter}")
    println("hello world")
    var a : Int = 10;
    var b = 20; //compiler will infer b is of type int
    //var d ; // type is required
    var c = add(10,20);
    print(c)
}

fun add(firstNo : Int, sno :Int): Int {
    return firstNo+sno
}