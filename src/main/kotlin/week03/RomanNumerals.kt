package week03
// Florencio Rueda 3.1 Roman Numerals 09/20/22
import java.util.*

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    println("Enter a number from 1-10: ")
    val n = `in`.nextInt()

    when (n) {
        1 -> println("I")
        2 -> println("II")
        3 -> println("III")
        4 -> println("IV")
        5 -> println("V")
        6 -> println("VI")
        7 -> println("VII")
        8 -> println("VIII")
        9 -> println("IX")
        10 -> println("X")
        else -> println("Error. Entered number is not in range [1-10]")
    }
}
/*
pseudocode code :
Have

 */