import java.time.LocalDateTime

fun main(Args: Array<String>) {

    println("enter birth year : ")
    var user_year: Int = readLine()!!.toInt()
    var this_year: Int = LocalDateTime.now().year
    var s = this_year - user_year

    if (user_year > this_year) {
        println("you must have come from the future")
    } else {
        println("your age: "+ s)
    }

}