package week04

// Florencio rueda 4.5 Random Number Guessing Game 09/ 20/ 22
fun main() {
    val r = (0..10).random()

    println("Your guess")
    val guess = Integer.valueOf(readLine())

    println("My number:" + r)
    println("Your guess:")
    println(message = guess)

    if (guess < r) {
        println("Your guess is too Low, try again.")
    }
    if (guess > r) {
        println("Your guess is too high, try again")
    }
    if (guess == r) {
        println("Your guess is correct!")
    }

}