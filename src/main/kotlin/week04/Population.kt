package week04
// Florencio rueda 4.3 Population 09/25/22

    fun main(args: Array<String>) {
        var rate = 0.0
        print("Number of organisms: ")
        var numOfOrganisms = Integer.valueOf(readLine())

        print("Number of days to multiply: ")
        var days = Integer.valueOf(readLine())

        print("Percentage of increase: ")
        var percentage = Integer.valueOf(readLine())/ 100

        println("")
        println("Day" + "       Population" + "       Percent of Increase")
        println("  1           "+ numOfOrganisms)
        for (i in 2 until days + 1) {
            numOfOrganisms += 0.let { rate *= it; numOfOrganisms }
            println("  " + i + "           " + numOfOrganisms + "                " +  (rate* 100 ) + "%")
        }
    }
