package week04
// florencio rueda 4.6 ESP Game 09/25/22
import java.util.*

    var colors = arrayOf("Red", "Green", "Blue", "Orange", "Yellow")
    var win = 0

    fun main(args: Array<String>) {
        var choice: String
        var computerChoice: String
        for (i in 0..9) {
            computerChoice = computerChoice()
            choice = userChoice()
            if (isValidChoice(choice)) {
                determineWinner(computerChoice, choice)
                println("Random color was: $computerChoice")
            } else {
                println("Invalid color")
            }
        }
        println("You won " + win + " amount of times")
    }

    fun computerChoice(): String {
        val rng = Random()
        val computerChoice: String
        val ran = rng.nextInt(4) + 1
        computerChoice =
            if (ran == 1) colors[0] else if (ran == 2) colors[1]
            else if (ran == 3) colors[2] else if (ran == 4) colors[3] else colors[4]
        return computerChoice
    }

    fun userChoice(): String {
        val sc = Scanner(System.`in`)
        val choice: String
        println("Enter a color from this list: Red, Green, Blue, Orange, Yellow")
        choice = sc.nextLine()
        return choice
    }

    fun isValidChoice(choice: String?): Boolean {
        for (i in colors.indices) {
            if (colors[i].equals(choice, ignoreCase = true)) return true
        }
        return false
    }

    fun determineWinner(computer: String, user: String?) {
        if (computer.equals(user, ignoreCase = true)) {
            println("You guessed it right")
            win++
        } else {
            println("Incorrect guess")
        }
    }
