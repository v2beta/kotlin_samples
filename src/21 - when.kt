fun main(args: Array<String>) {

    print("enter number ")
    var a: Int = readLine()!!.toInt()

    try {
        when (a) {

            1 -> print("your number: $a")
            2 -> print("your number: $a")
            3 -> print("your number: $a")

            else -> print("number is not in list")

        }
    } catch (e:IllegalArgumentException) {
        print("only number!")
    }
}
