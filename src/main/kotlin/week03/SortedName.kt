package week03
//Florencio rueda 3.5 Sorted Names  9/22/22
import java.util.*

    fun main(args: Array<String>) {
        val name1: String
        val name2: String
        val name3: String
        val input = Scanner(System.`in`)
        println("Enter First name")
        name1 = input.nextLine()
        println("Enter Second name")
        name2 = input.nextLine()
        println("Enter third name")
        name3 = input.nextLine()
        if (name1.compareTo(name2) < 0) {
            if (name2.compareTo(name3) < 0) {
                println("$name1,$name2 and $name3")
            } else {
                if (name3.compareTo(name1) < 0) println("$name3,$name1 and $name2")
                else println("$name1,$name3 and $name2")
            }
        } else {
            if (name3.compareTo(name1) < 0) {
                println("$name2,$name3 and $name1")
            } else {
                if (name3.compareTo(name2) < 0) {
                    println("$name3,$name2 and $name1")
                } else println("$name2,$name1 and $name3")
            }
        }
    }
/*
pseudocode code :
i used scanner so i need import scanner
i need names and need 3 names so i set name1,name2.name3.
then ask the user for input(println(enter names))
user will input 3 names total.
now ill use if and else statement to compare names and do the alphabetical.
when calculation is done, it will println(names) the names in order.
 */