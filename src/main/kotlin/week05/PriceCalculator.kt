package week05
//Florencio Rueda 5.3 Retail Price Calculator Problem Oct 22 2022

    fun calculateRetail(cost: Double, markup: Double): Double {
        return cost + cost * markup / 100
    }

    fun main(args: Array<String>) {

        val cost: Double
        val markup: Double
        print("Enter the item's whole sale cost. ")
        cost = readLine()!!.toDouble()
        print("Enter the item's markup percentage. ")
        markup = readLine()!!.toDouble()
        val retail = calculateRetail(cost, markup)
        println("The item's retail price is $$retail")
    }
