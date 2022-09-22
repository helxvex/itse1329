package week02
// Florencio Rueda 2.9 Compound Interest 09/15/22
import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("How much money do you have on your account?")
    var P = Integer.valueOf(readLine())
    println("What is your annual interest rate ? ")
    var R = readLine()!!.toDouble()
    println("How many of times per year the interest is compounded?")
    var N = readLine()!!.toDouble()
    println("How many years will you leave it ?")
    var T = Integer.valueOf(readLine())

    var A = P * (1 + (R / N)).pow( N * T)

    println("This is the amount:${A}")
}

