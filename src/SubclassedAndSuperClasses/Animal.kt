package SubclassedAndSuperClasses

/*
To use a class as a superclass, it must be declared as open. Everything you want to override must also be open.
Declaring functions as final, it can no longer be overriden in any subclass
 */
open class Animal {

    /*
    The animal class has properties named image, food, habitat and hunger.
     */
    open val image = ""
    open val food = ""
    open val habitat = ""
    val hunger = 10

    /*
    Defined default implementations of the methods(functions)
     */
    open fun makeNoise(){
        println("The animal is making noise")
    }

    open fun eat(){
        println("The animal is eating")
    }

    open fun roam(){
        println("The animal is roamin")
    }

    fun sleep(){
        println("The animal is sleeping")
    }
}