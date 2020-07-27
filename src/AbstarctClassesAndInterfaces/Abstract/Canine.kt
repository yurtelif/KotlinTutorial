package AbstarctClassesAndInterfaces.Abstract

import AbstarctClassesAndInterfaces.Abstract.Animal

abstract class Canine : Animal() {
    override fun roam() {
        println("The canine is roaming")
    }
}