package SubclassedAndSuperClasses

/*
Class Hippo is subtype of Animal class
 */
class Hippo : Animal() {

    /*
    You can override funcitons and variables using override keyword
     */

    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The hippo is eating $food")
    }

}