class Car(Brand: String, Model: String, Price: Double) {

    var Price: Double? = null

    init {
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

    var selcukscar = Car("Honda", "Jazz", 44.4444)
    println()
    var pirayescar = Car("Toyota", "Corolla", 22.2222)
    println()
    println(pirayescar.whatprice())

}
