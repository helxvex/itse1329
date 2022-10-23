package week05
//Florencio rueda 5.5 Celsius Temperature Table Oct 22.2022

fun main(args: Array<String>) {

    var df: Double = 0.0

    println("\nFahrenheit        Celsius")
    println("----------        -------")

    for (i in 0..20) {
        df = i.toDouble()
        var str = String.format("%.2f                 %.2f", df, celsius(df))
        println(str)
    }
}

fun celsius(f: Double): Double {
    return 5.0 / 9.0 * (f - 32)
}
