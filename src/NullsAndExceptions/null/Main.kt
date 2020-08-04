package NullsAndExceptions.`null`

fun main() {
    var w: Wolf? = Wolf()

    if (w != null) {
        w.eat()
    }

    var x = w?.hunger
    println("The value of x is $x")

    //Elvis operator ?:
    var y = w?.hunger ?: -1
    println("The value of y is $y")

    var myWolf = MyWolf()
    myWolf?.wolf?.hunger = 8
    println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")

    var myArray = arrayOf("Hi", "Hello", null)
    for (item in myArray) {
        // prints non-null items
        item?.let { println(it) }
    }

    getAlphaWolf()?.let { it.eat() }

    w = null
    //this will throw a NullPointerException
    var z = w!!.hunger

}