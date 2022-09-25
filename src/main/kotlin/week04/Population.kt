package week04
// Florencio rueda 4.3 Population 09/25/22
import java.text.DecimalFormat
import java.util.*
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val df = DecimalFormat.getInstance()
        df.maximumFractionDigits = 2
        var days: Int
        var organisms = 0.0
        var increaseRate = 0.0
        print("Number of organisms: ")
        organisms = input.nextDouble()
        while (organisms < 2) {
            print("Ivalid entry. Re-enter a value greater than 1: ")
            organisms = input.nextDouble()
        }
        print("Number of days to multiply: ")
        days = input.nextInt()
        while (days < 1) {
            print("Invalid entry. Re-enter a value greater than 0: ")
            days = input.nextInt()
        }
        print("Percentage of increase: ")
        increaseRate = input.nextDouble() / 100
        while (increaseRate < 0) {
            print("Ivalid entry. Re-enter a non-negative value: ")
            increaseRate = input.nextDouble()
        }
        println("")
        println("Day" + "       Population" + "       Percent of Increase")
        println("  1           " + df.format(organisms))
        for (i in 2 until days + 1) {
            organisms += increaseRate.let { organisms *= it; organisms }
            println("  " + i + "           " + df.format(organisms) + "                " + increaseRate * 100 + "%")
        }
    }
