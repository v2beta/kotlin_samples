fun main(args:Array<String>){
    var map = hashMapOf(1 to "selcuk", 2 to "piraye", 3 to "vera")
    map.put(4, "hande")

    for (i in map){
        println(i)
    }

    var array = arrayOf(1,2,3,4,5,6,7,8,9,0)

    for (i in array){
        println(i)
    }

    var listof = listOf(11,22,33,44,55)

    println("indexof 33 "+ listof.indexOf(33))

    for (i in listof){
        println(i)
    }

    var mutable = mutableListOf<Int>(1,2,3,4,5)
    mutable[1] = 9

    for (i in mutable) {
        println(i)
    }
}
