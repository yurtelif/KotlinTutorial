package NullsAndExceptions.`null`

class Wolf {

    var hunger = 10
    val food = "meat"

    fun eat(){
        println("The wold is eating $food")
    }

}

class MyWolf{

    var wolf: Wolf? = Wolf()

    fun myFunction() {
        wolf?.eat()
    }
}

fun getAlphaWolf() : Wolf? {
    return Wolf()
}