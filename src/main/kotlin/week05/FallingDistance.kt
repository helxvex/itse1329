package week05
// Florencio rueda 5.4 Falling Distance Oct 22 2022

    fun main(args: Array<String>) {
        for (i in 1..20) {
            println("Falling distance " + fallingDistance(i.toDouble()) + " for falling time " + i + " seconds.")
        }
    }
    fun fallingDistance(fallingTime: Double): Double {
        val g = 9.8
        val half = 0.5
        return half * g * Math.pow(fallingTime, 2.0)
    }
