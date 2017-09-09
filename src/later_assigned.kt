fun main(args:Array<String>) {

    var a = 20
    var b = 30
    var maxInt:Int?

    if (a>b){
        maxInt = a
    } else {
        maxInt = b
    }

    println("max int $maxInt")

    var max = if(a>b) a else b

    println("max int short: $max")
}
