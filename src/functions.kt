fun main(args:Array<String>) {
    var s = gather(10,20);
    println(s)
    sayhi()
}

fun gather(a:Int,b:Int):Int {
    var s = a +b
    return s;
}

fun sayhi() {
    println("hello everyone")
}
