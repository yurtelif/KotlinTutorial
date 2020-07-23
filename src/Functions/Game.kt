package Functions

fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionParam: Array<String>) =  optionParam[(optionParam.indices).random()]

fun getUserChoice(optionParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    //Loop until user choice is valid
    while (!isValidChoice){
        print("Please enter one of the following:")
        for (item in optionParam) print(" $item")
        println(".")
        val userInput = readLine()
        if(userInput != null && userInput in optionParam){
            isValidChoice = true
            userChoice = userInput
        }
        if(!isValidChoice) println("You must enter a valid choice")
    }

    return userChoice
}

fun printResult(userChoice: String, gameChoice: String){
    val result: String
    if (userChoice == gameChoice) result = "Tie"
    else if (  (userChoice == "Rock" && gameChoice == "Scissors")
            || (userChoice == "Paper" && gameChoice == "Rock")
            || (userChoice == "Scissors" && gameChoice == "Paper")) result = "You win!"
    else result = "You lose"
    println("You choose $userChoice. I choose $gameChoice. $result")
}