package week03
//Florencio rueda  3.6 Running the Race  9/22/24
import java.util.*

    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        println("Enter Name and then time:")
        val runner1 = scan.nextLine()
        val time1 = scan.nextInt()
        val scan2 = Scanner(System.`in`)
        println("Enter Name and then time:")
        val runner2 = scan2.nextLine()
        val time2 = scan2.nextInt()
        val scan3 = Scanner(System.`in`)
        println("Enter Name and then time:")
        val runner3 = scan3.nextLine()
        val time3 = scan3.nextInt()
        println("Runner:$runner1 Time:$time1")
        println("Runner:$runner2 Time:$time2")
        println("Runner:$runner3 Time:$time3")
        if (time1 >= time2) {
            if (time2 >= time3) print("In order $runner3 $runner2 $runner1") else if (time3 >= time1) print("In order $runner2 $runner1 $runner3") else if (time1 >= time3) print(
                "In order $runner2 $runner3 $runner1"
            )
        } else {
            if (time3 >= time2) print("In order $runner1 $runner2 $runner3") else if (time3 >= time1) print("In order $runner1 $runner3 $runner2") else if (time1 >= time3) print(
                "In order $runner3 $runner1 $runner2"
            )
        }
    }
/*
pseudocode code :
user input is needed so import scanner and then named it `scan`
ask the user for a name and time X3
take all 3 user input in times and names and then prints them out
then have if and else statements take those inputs and arrange the order from fastest to lowest
after all that done, println the order.
 */