fun main(args: Array<String>) {
    var map = HashMap<String,Int>()
    map.put("selcuk",1987)
    map.put("piraye",2015)
    map.put("vera",2000)

    println(map)
    println("selcuk value " +map.get("selcuk"))

    for (i in map.values){
        println(i)
    }

    println("------------")

    for (i in map.keys){
        println(i)
    }

    println("------------")

    for (i in map){
        println("key:" +i.key)
        println("value:" +i.value)
    }


}
