fun main(args:Array<String>) {
    var setelement = setOf<Int>(11,22,33,44,55,66,66)

    for (i in setelement){
        println(i)
    }

    println()

    var setMutable = mutableSetOf<Int>(11,22,33,44)

    setMutable.add(55)

    for (i in setMutable){
        println(i)
    }
}
