package week04

// Florencio rueda 4.3 Population 09/27/22

fun main(args: Array<String>) {


    var days: Int
    var organisms = 0.0
    var increaseRate = 0.0
    print("Number of organisms: ")
    organisms = readLine()!!.toDouble()
    while (organisms < 2) {
        print("Invalid entry. Re-enter a value greater than 1: ")
        organisms = readLine()!!.toDouble()
    }
    print("Number of days to multiply: ")
    days = Integer.valueOf(readLine())
    while (days < 1) {
        print("Invalid entry. Re-enter a value greater than 0: ")
        days = Integer.valueOf(readLine())
    }
    print("Percentage of increase: ")
    increaseRate = readLine()!!.toDouble() / 100
    while (increaseRate < 0) {
        print("Invalid entry. Re-enter a non-negative value: ")
        increaseRate = readLine()!!.toDouble()
    }
    println("")
    println("Day" + "\tPopulation" + "\tPercent of Increase")
    println("\t1 \t" + organisms)
    for (i in 2 until days + 1) {
        organisms += increaseRate.let { organisms *= it; organisms }
        println("\t" + i + "\t" + Math.ceil(organisms) + "    " + increaseRate * 100 + "%")
    }
}