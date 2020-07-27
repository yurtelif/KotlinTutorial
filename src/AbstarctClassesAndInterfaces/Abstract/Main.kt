package AbstarctClassesAndInterfaces.Abstract

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
}