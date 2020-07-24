package ClassesAndObjects

fun main() {
    var myDog = Dog("Fido", 70, "mixed")
    myDog.weight_param = 75
    myDog.bark()

    var dogs = arrayOf(myDog, Dog("Ripper", 10, "Poddle"))
    dogs[1].weight_param = 15

    println("Weight in Kgs is ${myDog.weightInKgs}")
    myDog.weight = -2
    println("Weight is ${myDog.weight}")
    myDog.acitivities = arrayOf("Walks", "Fetching ballas", "Frisbee")

    val songOne = Song("Sing","Travis")
    val songTwo = Song("Let It Be","The Beatles" )
    songOne.play()
    songOne.stop()
    songTwo.play()



}