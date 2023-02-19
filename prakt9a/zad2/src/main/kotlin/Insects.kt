package Insect
open class Insects(_name: String) {
    var name = _name
    var speed = 29.1
    var color = "Желто-черный"
    var eat = "Пыльца"
    var live = "Улей"
    constructor (_name: String, _speed: Double, _color:String, _eat:String, _live:String) : this(_name)
    {
        name = _name
        speed = _speed
        color = _color
        eat = _eat
        live = _live
    }
    open fun Speed_ins(){
        println("Введите название насекомого с большой буквы")
        name = readLine()!!.toString()
        when (name)
        {
            "Муравей" -> println("Средняя скорость муравья - 2,6 км/ч")
            "Пчела" -> println("Средняя скорость пчелы - 22,4 км/ч")
            "Оса" -> println("Средняя скорость осы - 9,1 км/ч")
            "Комар" -> println("Средняя скорость комара - 1,8 км/ч")
            else -> println ("Даже не знаю какая у него скорость")
        }
    }
    open fun Count(){
        println("Введите название насекомого с большой буквы")
        name = readLine()!!.toString()
        when (name)
        {
            "Паук" -> println("У паука 8 лапок")
            "Муравей" -> println("У муравья 6 лапок")
            "Пчела" -> println("У пчелы 6 лапок")
            "Оса" -> println("У осы 6 лапок")
            "Комар" -> println("У комара 6 лапок")
            else -> println ("Даже не знаю сколько у него лапок")
        }
    }

    open fun GetInfo(){
        println("Это $name. $name имеет $color цвет. Средняя скорость: $speed")
        println("$eat это то, чем питается данное насекомое и $live - это его дом")

    }
}