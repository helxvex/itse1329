package week04
//Florencio rueda 4.1 Sum of Numbers 09/25/22
import java.util.*


    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        println("Enter a positive nonzero integer")
        var input = `in`.nextInt()
        var sum = 0
        while (input >= 0) {
            sum += input
            input++
            if(input == 51) break;

            println(+input)
        }
    }
