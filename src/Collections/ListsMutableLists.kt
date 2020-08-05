package Collections

fun main() {

    val shopping = listOf("Tea", "Eggs", "Milk")

    if (shopping.size > 0) {
        println(shopping.get(0))
    }

    for (item in shopping) println(item)

    if (shopping.contains("Milk")) {
        println(shopping.indexOf("Milk"))
    }

    val mShopping = mutableListOf("Tea", "Eggs")
    mShopping.add("Milk")
    //add to spesific index
    mShopping.add(1, "Milk")

    if (mShopping.contains("Milk")) {
        mShopping.remove("Milk")
    }

    if (mShopping.size > 1) {
        mShopping.removeAt(1)
    }

    if (mShopping.size > 0) {
        mShopping.set(0, "Coffee")
    }

    mShopping.sort()
    mShopping.reverse()
    mShopping.shuffle()

    val toAdd = listOf("Cookies", "Sugar")
    mShopping.addAll(toAdd)

    val toRemove = listOf("Milk", "Sugar")
    mShopping.removeAll(toRemove)

    val toRetain = listOf("Milk", "Sugar")
    mShopping.retainAll(toRetain)

    mShopping.clear()

    val shoppingCopy = mShopping.toList()

}
