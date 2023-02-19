import Insect.*
class Bee(var kind:String, var weight: Double, name: String, speed: Double, color:String, eat:String, live:String):Insects(name) {

    open fun Fly(){
        println("$name - Где-то летает")
    }
    open fun Pollen(){
        println("$name - добывает мёд")
    }
    override fun GetInfo(){
        println("Вид пчелы - $kind, Его вес $weight г")
    }

}