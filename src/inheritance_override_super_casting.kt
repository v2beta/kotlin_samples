open class Get(){

    var d = "selcuklu"

    open fun getName(name:String):Unit{
        println("name $name")
    }

    fun getLastname(lastname:String):Unit{
        println("lastname $lastname")
    }
}

class AllGet(): Get() {

    fun getD(){
        println(super.d)
    }

    override fun getName(name:String){
        println("override " +name +" "+ super.d)
    }

}

fun main(args: Array<String>) {

    var a = Get()
    var aa = AllGet()
    var b = a.getName("selcuk")
    var c = a.getLastname("sari")
    var d = aa.getName("othername")
    var e = aa.getD()
    var f = aa.getName("second name")
}
