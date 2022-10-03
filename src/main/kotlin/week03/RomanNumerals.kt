package week03
// Florencio Rueda 3.1 Roman Numerals 09/20/22


fun main(args: Array<String>) {
    println("Enter a number from 1-10: ")
    var n = Integer.valueOf(readLine())

    when (n) {
        1 -> println("I")
        2 -> println("II")
        3 -> println("III")
        4 -> println("IV")
        5 -> println("V")
        6 -> println("VI")
        7 -> println("VII")
        8 -> println("VIII")
        9 -> println("IX")
        10 -> println("X")
        else -> println("Error. Entered number is not in range [1-10]")
    }
}
/*
pseudocode code :
first I need to get user input, So use either an import with scanner, or use readline()
then I name the scanner to "n".
I print the line ("Enter a number from 1-10") to ask the user.
I use the `when` function to "n" so if user input a number from 1-10, it gives out the roman numeral
If user gives a number that is not part of the input , it will give an error  in an  `else` saying("Error. Entered number is not in range [1-10]"),

 */