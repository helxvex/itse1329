package week04
//Florencio rueda 4.4 Bar Chart 09/24/22
import java.util.*

    fun main(args: Array<String>) {
        val store = DoubleArray(5)
        val userInput = Scanner(System.`in`)
        for (i in 0..4) {
            System.out.printf("Enter today's sales for store %d: ", i + 1)
            store[i] = userInput.nextDouble()
        }
        println("SALES BAR CHART")
        for (i in 0..4) {
            System.out.printf("Store %d: ", i + 1)
            var t = 0
            while (t < store[i] / 100) {
                print("*")
                t++
            }
            println()
        }
        userInput.close()
    }
