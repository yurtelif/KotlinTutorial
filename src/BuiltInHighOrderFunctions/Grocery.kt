package BuiltInHighOrderFunctions

data class Grocery(val name: String,
                   val category: String,
                   val unit: String,
                   val unitPrice: Double,
                   val quantity: Int)

fun main() {
    val groceries = listOf(Grocery("Tomatoes", "Vegetable", "1b", 3.0, 3),
            Grocery("Mushrooms", "Vegetable", "1b", 4.0, 1),
            Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
            Grocery("Olive Oil", "Pantry", "Bottle", 6.0, 1),
            Grocery("Ice cream", "Frozen", "Pack", 3.0, 2))

    val highUnitPrice = groceries.maxBy { it.unitPrice * 5 }
    println("highestUnitPrice: $highUnitPrice")
    val lowestQuantity = groceries.minBy { it.quantity }
    println("lowestQuantity: $lowestQuantity")

    val sumQuantity = groceries.sumBy { it.quantity }
    println("sumQuantity: $sumQuantity")
    val totalPrice = groceries.sumByDouble { it.quantity * it.unitPrice }
    println("totalPrice: $totalPrice")
}