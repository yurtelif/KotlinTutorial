package Collections

fun main() {

    // set does not allow to duplicate values
    val friendSet = setOf("Jim", "Sue", "Nick")

    val isFredGoing = friendSet.contains("Fred")

    for (item in friendSet) println(item)

    val mFriendSet = mutableSetOf("Jim", "Sue")
    mFriendSet.add("Nick")
    mFriendSet.remove("Nick")

    // also addAll, removeAlli retainAll and clear

    val friendSetCopy = mFriendSet.toSet()
    val friendList = mFriendSet.toList()


}