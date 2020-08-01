package AbstarctClassesAndInterfaces.Interface

fun main(){
    val animals = arrayOf(Hippo(), Wolf())
    animals.forEach {
        it.roam()
        it.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveSHot(wolf)
    vet.giveSHot(hippo)

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for(item in roamables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }
}