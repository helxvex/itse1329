package week03
//Florencio rueda 3.4 Mass and Weight  9/22/22
import java.util.*

    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        println("Enter your mass:")
        val mass = `in`.nextDouble()

        val Weight: Double
        Weight = mass * 9.8
        if (Weight > 1000) print("The object weight is $Weight Newtons\n The object is too heavy ")

        else if (Weight < 10) print("The object weight is $Weight Newtons\n The object is too light "

        ) else print("The object weight is $Weight Newtons")
    }
/*
pseudocode code :
need user input so I imported scanner
I called scanner `in`
println ("enter your mass:)
user input here (mass)
have weight as a double.
weight will be = mass * 9.8
so if weight is greater than 1000, it will print (too heavy)
if weight is less than 10, print (object light)
else print (object weight (user weight)newtons)


 */