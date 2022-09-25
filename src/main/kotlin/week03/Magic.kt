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
/*
pseudocode code :
First i need get the user input so I used an import with a scanner
call the scanner n and have value for day, month, year, and magic and all need to be an int (integer)
I also do print ("Enter a month, day, year") for the user input .
Also have calculations for the " magic num"(day*month)
have the code say the month day year
I also have an `if` statement to do the magic year, so if magic is = to year, it will say its a magic year, and
else it will say not a magic year.
 */
