class FirstClassKt {
    var name:String?= "Name is not defined"
    var price:Int?= 0

    fun showInfos(){
        println("INFOS: ")
        println("Name: ${name ?: "Ad yoxdur"}")
        println("Price: ${price ?: "Qiymet yoxdur"}")
    }
    constructor(name:String, price:Int){
        this.name = name
        this.price = price
    }
    data class Car(var name: String, var price: Int){
        fun showInfos(){
            println("INFOS: ")
            println("Name: ${name ?: "Ad yoxdur"}")
            println("Price: ${price ?: "Qiymet yoxdur"}")
        }
    }
}
