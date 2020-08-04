package DataClasses

data class Recipe(val title: String, val mainIngredient: String, val isVetegerian: Boolean = false, val difficulty: String = "Easy")

class Mushroom(val size: Int, val isMagic: Boolean) {

    constructor(isMagic_param: Boolean) : this(0, isMagic_param) {
        //code that runs when the secondary constructor is called
    }

}

fun findRecipes(title: String = "",
                ingredient: String = "",
                isVetegerian: Boolean = false,
                difficulty: String = "") : Array<Recipe> {
    // code to find recipes
    return arrayOf(Recipe(title, ingredient, isVetegerian, difficulty))
}

// overloading examples

fun addNumbers(a: Int, b: Int) : Int{
    return a+b
}

fun addNumbers(a: Double, b: Double) : Double{
    return a+b
}


fun main() {
    val r1 = Recipe("Thai Curry", "Chicken")
    val r2 = Recipe(title = "Thai Curry", mainIngredient = "Chicken")
    val r3 = r1.copy("Chicken Bhuna")
    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")
    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 === r2}")
    println("r1 == r3? ${r1 == r3}")
    val (title, mainIngredient, vegeterian, difficulty) = r1
    println("title is ${title} and vegeterain is ${vegeterian}")

    //creates mushroom with primary constructor
    val m1 = Mushroom(6, false)
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")
    //creates mushroom with secondary constructor
    val m2 = Mushroom(true)
    println("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")

    println(addNumbers(2, 5))
    println(addNumbers(1.5, 8.5))


}


