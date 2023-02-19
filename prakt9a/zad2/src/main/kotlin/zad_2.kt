
import  Insect.Insects as newInsect

fun main(){

    var Beeone = Bee("Итальянская пчела", 0.123, "Пчела", 23.3, "Желтый", "Пыльца", "Улей")
    Beeone.Fly()
    Beeone.Pollen()
    Beeone.GetInfo()
    Beeone.Speed_ins()
    Beeone.Count()

    var insectKomar = newInsect("Комар", 1.8, "Бурый", "Кровь", "Болото")
    println("Название ${insectKomar.name}\n Скорость ${insectKomar.speed} км/ч\n Окраска ${insectKomar.color}\n Пища ${insectKomar.eat} \n Среда обитания ${insectKomar.live}")
    var Antone = Ant("Рыжий муравей", 0.002, "Муравей", 2.6, "Рыжий", "Сок растений", "Муравейник")
    Antone.Strength()
    Antone.Forest()
    Antone.GetInfo()

    var insectOsa = newInsect("Оса", 9.1, "Желтый", "Пыльца", "Дупло дерева")
    println("Название ${insectOsa.name}\n Скорость ${insectOsa.speed} км/ч\n Окраска ${insectOsa.color}\n Пища ${insectOsa.eat}\n Среда обитания ${insectOsa.live}\n")

}
