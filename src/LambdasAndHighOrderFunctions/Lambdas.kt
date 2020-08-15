package LambdasAndHighOrderFunctions

fun main() {

    var addFive = { x: Int -> x + 5}
    println("Pass 3 to addFive: ${addFive(3)}")

    val addInts = { x: Int, y: Int -> x+y }
    val result = addInts.invoke(3,5)
    println("Pass 3,5 to addInts: $result")

    val intLambda: (Int, Int) -> Int = { x, y -> x * y }
    println("Pass 8,9 to intLambda: ${intLambda(8, 9)}")

    val addSeven: (Int) -> Int = { it + 7 }
    println("Pass 5 to addSeven: ${addSeven(5)}")

    val myLambda: () -> Unit = { println("Hello") }
    myLambda()
}