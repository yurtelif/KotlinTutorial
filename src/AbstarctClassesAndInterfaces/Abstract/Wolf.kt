package AbstarctClassesAndInterfaces.Abstract

import AbstarctClassesAndInterfaces.Abstract.Canine

class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hoooooowl")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }

}