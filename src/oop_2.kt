class Car2() {

    var Price: Double? = null

    constructor(Brand: String, Model: String, Price: Double):this() {
        println("Brand $Brand")
        println("Model $Model")
        println("Price $Price")
        this.Price = Price
    }

    fun whatprice(): Double? {
        return Price
    }

}

fun main(args: Array<String>) {

    var selcukscar = Car2("Honda", "Jazz", 44.4444)
    println()
    var pirayescar = Car2("Toyota", "Corolla", 22.2222)
    println()
    println(pirayescar.whatprice())

}
