package SubclassedAndSuperClasses

open class Canine : Animal() {
    override fun roam() {
        println("The canine is roaming")
    }
}