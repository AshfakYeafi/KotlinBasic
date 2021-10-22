/* Primary constructor */

class Laptop constructor(
    var name:String,
    var price:Int
){
    init {
        println("This is init of LAPTOP class")
    }
    fun show(){
        println("Laptop Name is : $name and Price is $price")
    }
}

/* Secondary constructor */
//class Laptop_1(){
//
//    constructor(name: String , price: Int)
//
//
//
//    fun show(){
//        println("Laptop Name is : ${name} and Price is $price")
//    }
//}

fun main(){
    var lap_1=Laptop("DELL",1000)
    lap_1.show()
//    var lap_2=Laptop_1("Apple",1500)
//    lap_2.show()
}