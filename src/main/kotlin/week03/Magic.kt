package week03
//florencio rueda 3.2 Magic Dates 9/20/22
import java.util.*

    fun main(args: Array<String>) {
        println("Enter a month ")
        val n = Scanner(System.`in`)
        val day: Int
        val month: Int
        val year: Int
        val magic: Int
        month = n.nextInt()
        println("Enter a day ")
        day = n.nextInt()
        println("Enter two-digit year ")
        year = n.nextInt()
        println("The entered date is : $day/$month/$year")
        magic = day * month
        if (magic == year) println("Date $day/$month/$year is a MAGIC year !")
        else println("Date $day/$month/$year is not a MAGIC year !")
    }
