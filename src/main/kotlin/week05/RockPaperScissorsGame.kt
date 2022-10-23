package week05
//Florencio Rueda 5.7 Rock, Paper, Scissors Game Oct 23 2022

val MIN = 1
val MAX = 3

enum class Choices(val choice: Int) {
    ROCK(1),
    PAPER(2),
    SCISSORS(3)
}

fun main() {
    var play = true
    while (play) {
        play = playGame()
    }
}

fun playGame(): Boolean {
    val randomNumber = MIN + (Math.random() * MAX).toInt()
    var cpu: Choices = intToChoice(randomNumber)

    println("Enter: \n1 for Rock\n2 for Paper\n3 for Scissors")
    var playerNumber = readln().toInt()
    var player = intToChoice(playerNumber)
    println(String.format("You chose %s and computer chose %s", player, cpu))

    return when {
        player == Choices.ROCK && cpu == Choices.SCISSORS -> {
            println("You win\nThe rock smashes the scissors.")
            false
        }

        player == Choices.ROCK && cpu == Choices.PAPER -> {
            println("You lose")
            false
        }

        player == Choices.PAPER && cpu == Choices.ROCK -> {
            println("You win\nPaper wraps rock")
            false
        }

        player == Choices.PAPER && cpu == Choices.SCISSORS -> {
            println("You lose")
            false
        }

        player == Choices.SCISSORS && cpu == Choices.PAPER -> {
            println("You win\nScissors cuts paper.")
            false
        }

        player == Choices.SCISSORS && cpu == Choices.ROCK -> {
            println("You lose")
            false
        }

        else -> {
            println("Its a draw")
            true
        }

    }
}

fun intToChoice(i: Int): Choices {
    return when (i) {
        1 -> Choices.ROCK
        2 -> Choices.PAPER
        3 -> Choices.SCISSORS
        else -> Choices.ROCK
    }

}



