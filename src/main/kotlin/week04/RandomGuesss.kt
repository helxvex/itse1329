package week04
// florenio rueda 4.5 Random Number Guessing Game 09/22/22
import java.util.*


    const val MIN = 1
    const val MAX = 100

    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        println("Enter your guess")
        var numberInput = `in`.nextInt()
        while (numberInput < MIN || numberInput > MAX) {
            println("Guess a number between " + MIN + " through " + MAX + ".")
            numberInput = `in`.nextInt()
        }
        val randomNumber = MIN + (Math.random() * MAX).toInt()
        if (numberInput == randomNumber) println("Your guess is right!") else if (numberInput < randomNumber) println("To low.") else if (numberInput > randomNumber) println(
            "To high"
        )
        println("The random number is:$randomNumber")
    }
