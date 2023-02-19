import  Car.Cars as NewCar
fun main(){
    var CarOne = BMW("X5", "Черный", "BMW", 89.2, 1345600.0)
    CarOne.Origin()
    CarOne.Who()
    CarOne.GetInfo()
    CarOne.Country()
    CarOne.Count()
    var Citroen = NewCar("Citroen", 76.1, 680000.0)
    println("Марка ${Citroen.brand}\n Мощность ${Citroen.power}\n  Стоимость ${Citroen.price}\n")
    var MercedesOne = Mercedes("CLS-Class", "Серебристый", "Mercedes", 94.7, 1530000.0)
    MercedesOne.Fact()
    MercedesOne.Everybody()
    MercedesOne.GetInfo()
    var Lada = NewCar("Lada", 176.9, 1980000.0)
    println("Марка ${Lada.brand}\n Мощность ${Lada.power}\n  Стоимость ${Lada.price}\n")
}