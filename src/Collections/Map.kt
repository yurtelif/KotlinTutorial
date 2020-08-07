package Collections


fun main() {

    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quinoa Salad")
    val r3 = Recipe("Thai Curry")

    val recipeMap = mapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)

    val recipeToCheck = Recipe("Chicken Soup")
    if (recipeMap.containsValue(recipeToCheck)){
        // some code
    }

    if (recipeMap.containsKey("Recipe1")){
        val recipe = recipeMap.getValue("Recipe1")
    }

    for ((key, value) in recipeMap) {
        println("key is $key, value is $value")
    }


    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2)
    mRecipeMap.put("Recipe3", r3)

    val r4 = Recipe("Jambalaya")
    val r5 = Recipe("Sausage Rolls")

    val recipesToAdd= mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)

    mRecipeMap.remove("Recipe2")
    /*
    OR remove with key and value
    val recipeToRemove = Recipe("Quinoa Salad")
    mRecipeMap.remove("Recipe2", recipeToRemove)
     */

    mRecipeMap.clear()

    val recipeMapCopy = mRecipeMap.toMap()
    val recipeList = mRecipeMap.toList()
    val recipeEntries = mRecipeMap.entries

}

data class Recipe(val title: String)