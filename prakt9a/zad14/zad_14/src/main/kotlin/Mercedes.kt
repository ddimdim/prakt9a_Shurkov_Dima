import Car.*

class Mercedes(var model:String, var color: String, brand:String, power:Double, price:Double): Cars(brand) {
    open fun Fact(){
        println("$brand сначала начали производить печатные машинки, а не автомобили")
    }
    open fun Everybody(){
       println("$brand знает почти каждый человек")
    }
    override fun GetInfo() {
        println("Одна из моделей $brand: $model, его цвет - $color")
    }
}