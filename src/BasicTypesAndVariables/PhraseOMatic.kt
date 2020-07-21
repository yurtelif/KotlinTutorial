package BasicTypesAndVariables

fun main() {
    var wordArray1 = arrayOf("24/7", "multi-tier","B-to-B", "dynamic", "pervasive")
    var wordArray2 = arrayOf("empowered", "leveraged","aligned", "targeted")
    var wordArray3 = arrayOf("process", "paradigm","solution", "portal", "vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    //Kotlin 1.2 from Java
    val rand1 = (Math.random() * arraySize1).toInt()
    //Kotlin 1.3
    val rand2 = (0 until arraySize2).random()
    val rand3 = (Math.random() * arraySize3).toInt()

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)
}