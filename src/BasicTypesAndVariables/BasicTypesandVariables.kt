package BasicTypesAndVariables

var x = 3
var hugeNumber = 6L //long

fun main() {
    var array = arrayOf(1, 2, 3)
    println("array value before change ${array[1]}")
    array[1] = 12
    println("array value after change ${array[1]}")
}