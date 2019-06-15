import com.oracle.javafx.jmx.json.JSONWriter
import jdk.nashorn.internal.parser.JSONParser

fun main(args: Array<String>) {

    var arraylist = ArrayList<String>()

    arraylist.add("selcuk")
    arraylist.add("20")
    arraylist.add("1987")


    println("first: " + arraylist.get(0))

    for (f in arraylist) {
        println(f)
    }


    if (arraylist.contains("selcuk")) {
        println("selcuk in arraylist!")
    }

    for (index in 0 until arraylist.size) {
        println(arraylist.get(index))
    }

    for (i in 0..(arraylist.size - 1)) {
        println(i)
    }

}
