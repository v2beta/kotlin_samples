fun main(Args: Array<String>) {

    print("enter name : ")
    var name:String = readLine()!!.toString()
    print("Age : ")
    var age: Int = readLine()!!.toInt()

    println(name + " is " + age + " years old")
}