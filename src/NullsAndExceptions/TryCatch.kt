package NullsAndExceptions

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun myFunction(str: String) {
    try {
        val x = str.toInt()
        println(x)
    } catch (e: NumberFormatException) {
        println("Bummer")
    }

    try {
        setWorkRatePercentage(110)
    } catch (e: IllegalArgumentException) {
        //handle exception
    }

    val str = "Test"
    //expression example
    val result = try { str.toInt() } catch (e: Exception) { null }
}

// throw exception
fun setWorkRatePercentage(x: Int) {
    if(x !in 0..100){
        throw IllegalArgumentException("Percentage not in range")
    }
}