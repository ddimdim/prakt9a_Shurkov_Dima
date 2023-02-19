import Insect.*
class Ant(var kind:String, var weight: Double, name: String, speed: Double, color:String, eat:String, live:String):Insects(name) {

    open fun Strength(){
        println("$name поднимает вес, который больше в 40-60 собственного веса")
    }
    open fun Forest(){
        println("$name сейчас в лесу")
    }
    override fun GetInfo(){
        println("Вид муравья - $kind, Его вес $weight г")
    }

}