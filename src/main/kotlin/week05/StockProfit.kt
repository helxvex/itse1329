package week05
// Florencio rueda 5.6 Stock Profit Oct 23 2022

fun main() {
    println("Enter number of shares:")
    var NS = readLine()!!.toDouble()
    println("Enter purchase price per share:")
    var PP = readLine()!!.toDouble()
    println("Enter purchase commission paid:")
    var PC = readLine()!!.toDouble()
    println("Enter sale price per share:")
    var SP = readLine()!!.toDouble()
    println("Enter sale commission paid:")
    var SC = readLine()!!.toDouble()
    var profit = calculateProfit(NS, PP, PC, SP, SC)
    if (profit >= 0)
        println(String.format("Your earned a total of $%.2f", profit))
    else
        println(String.format("Your loss a total of $%.2f", profit))
}

fun calculateProfit(NS: Double, PP: Double, PC: Double, SP: Double, SC: Double): Double {
    return ((NS * SP) - SC) - ((NS * PP) + PC)

}

