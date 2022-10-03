package week04
// florenio rueda 4.5 Random Number Guessing Game 09/22/22

    const val MIN = 1
    const val MAX = 100
    fun main(args: Array<String>) {

        println("Enter your guess")
        var numberInput = Integer.valueOf(readLine())
        if (numberInput < MIN || numberInput > MAX) {
            println("Guess a number between " + MIN + " through " + MAX + ".")

        }
        val randomNumber = MIN + (Math.random() * MAX).toInt()
        if (numberInput == randomNumber) println("Your guess is right!")
        else if (numberInput < randomNumber) println("To low.") else if (numberInput > randomNumber) println(
            "To high"
        )
        println("The random number is: $randomNumber")
    }
