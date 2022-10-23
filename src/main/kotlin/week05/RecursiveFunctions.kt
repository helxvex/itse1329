package week05
//Florencio rueda 5.2 Recursive functions Oct 22, 2022
fun main() {
    val myInput = 20
    println("The number is defined as: $myInput")
    fibonacciSeries(myInput)
}
fun fibonacciSeries(myInput: Int) {
    var temp1 = 0
    var temp2 = 1
    println("The fibonacci series till $myInput terms:")

    for (i in 1..myInput) {
        print("$temp1 ")
        val sum = temp1 + temp2
        temp1 = temp2
        temp2 = sum
    }
}