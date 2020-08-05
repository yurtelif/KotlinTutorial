package Collections

fun main() {
    //make an array
    var array = arrayOf(1, 2, 3)

    //make an array initialized with nulls
    var nullArray: Array<String?> = arrayOfNulls(2)

    //find out the size of the array:
    val size = array.size

    //reverse the order of the array
    array.reverse()

    //find out if it contains something
    val isIn = array.contains(1)

    //calculate the sum of it's items
    val sum = array.sum()

    //calculte the average of items
    val average = array.average()

    //find out minimum and maximum
    val min = array.min()
    val max = array.max()

    //sort the array in a natural order
    array.sort()
}