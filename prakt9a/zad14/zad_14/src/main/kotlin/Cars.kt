package Car

import java.lang.Exception

open class Cars (_brand: String) {
    var brand = _brand
    var power = 90.0
    var price = 925000.0

    constructor(_brand: String, _power: Double, _price: Double) : this(_brand) {
        brand = _brand
        power = _power
        price = _price
    }

    open fun Country() {
        println("Введите марку автомобиля ")
        brand = readLine()!!.toString()
        when (brand) {
            "BMW" -> println("Место основания BMW - Германия, Мюнхен")
            "Audi" -> println("Место основания Audi - Германия, Цвиккау")
            "Lada" -> println("Место основания Lada - Россия, Тольятти")
            "Citroen" -> println("Место основания Citroen - Франция, Пуасси")
            "Mercedes" -> println("Место основания Mercedes - Германия, Штутгарт")
            "Ferrari" -> println("Место основания Ferrari - Италия, Маранелло")
            "Volkswagen" -> println("Место основания Volkswagen - Германия, Вольфсбург")
            else -> println("Даже не знаю где была основана эта марка автомобиля")
        }
    }

    open fun Count() {
        try {
            var count = 0
            var newprice = 0.0
            while (newprice <= 100000.0 || count <= 0) {
                if (newprice <= 100000.0) {
                    println("Введите цену за автомобиль марки BMW(от 100000 руб)")
                    newprice = readLine()!!.toDouble()
                }
                else {
                    while (count <= 0) {
                        println("Введите кол-во автомобилей марки BMW, чтобы узнать цену покупки")
                        count = readLine()!!.toInt()
                        if (count <= 0) {
                            println("Вы не можете купить 0 или меньше автомобилей")
                        }
                        else {
                            newprice = count * newprice
                            println("Цена покупки за $count автомобилей: $newprice")
                        }
                    }
                }
            }
        }
        catch (e:Exception)
        {
            println("Данные были введены неверно")
        }
    }

    open fun GetInfo(){
        println("Марка автомобиля $brand. Его мощность $power. Цена за такой автомобиль: $price")
    }

}
