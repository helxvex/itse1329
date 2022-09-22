package week02

import java.util.Scanner
// Florencio rueda 2.8 String Manipulator 09/15/22
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("Enter the city name");
    var cityName = scanner.nextLine();
    println(cityName.uppercase())
    println(cityName.lowercase())
    println(cityName.length)
    println(cityName.first())

}
