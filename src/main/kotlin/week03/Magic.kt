package week03
//florencio rueda 3.2 Magic Dates 9/20/22

    fun main(args: Array<String>) {

        println ("Enter a two - digit month: ")
        var month = Integer.valueOf(readLine())
        println ("Enter a two-digit day: ")
        var day = Integer.valueOf(readLine())
        println ("Enter a two-digit year: ")
        var year = Integer.valueOf(readLine())

        print ("You entered $month/$day/$year ")

        if(month*day==year){
            print("Your date is a magic number!")
        }else{
            print("Your date is not a magic number!")
        }
    }
/*
pseudocode code :
First i need get the user input so I used an import with a scanner
call the scanner n and have value for day, month, year, and magic and all need to be an int (integer)
I also do print ("Enter a month, day, year") for the user input .
Also have calculations for the " magic num"(day*month)
have the code say the month day year
I also have an `if` statement to do the magic year, so if magic is = to year, it will say its a magic year, and
else it will say not a magic year.
 */
