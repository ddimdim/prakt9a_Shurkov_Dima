import Car.*

class BMW(var model:String, var color: String, brand:String, power:Double, price:Double):Cars(brand) {
open fun Origin()
{
    println("$brand основали в 1916 году")
}
    open fun Who(){
        println("Марку $brand основал Густав Отто")
    }

    override fun GetInfo() {
        println("Одна из моделей $brand: $model, его цвет - $color ")
    }

}