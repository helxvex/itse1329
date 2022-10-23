package week05
// Florencio rueda 5.1 Prime Time Oct 22, 2022

fun isNumberDivisible(number: Int, divisor: Int): Boolean {

    return ((number % divisor)==0)
}
fun isPrime(number: Int): Boolean {

    if(number<0)
        return false
    var i = 2
    while (i < number) {
        if (isNumberDivisible(number,i)) {
            return false
        }
        ++i
    }
    return true
}

fun main(args: Array<String>) {
    val num = 6
    val num2 = 13
    val num3 = 8893

    if (isPrime(num))
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")

    if (isPrime(num2))
        println("$num2 is a prime number.")
    else
        println("$num2 is not a prime number.")

    if (isPrime(num3))
        println("$num3 is a prime number.")
    else
        println("$num3 is not a prime number.")
}