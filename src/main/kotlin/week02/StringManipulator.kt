package week02
// Florencio rueda 2.8 String Manipulator 09/15/22
fun main(args: Array<String>) {
    println("Enter the city name");
    val string1 = readLine()!!

    var String = string1.toString()
    //var cityName = scanner.nextLine();
    println(String.uppercase())
    println(String.lowercase())
    println(String.length)
    println(String.first())

}
