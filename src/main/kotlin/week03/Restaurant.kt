package week03
//Florencio rueda  3.7 Restaurant Selector  9/22/24
import java.util.*

    fun main(args: Array<String>) {
        val choice = arrayOf("", "", "")
        val n = Scanner(System.`in`)
        println("Is anyone at your party vegetarian:")
        choice[0] = n.nextLine()
        println("Is anyone at your party a vegan:")
        choice[1] = n.nextLine()
        println("Is anyone at your party gluten free:")
        choice[2] = n.nextLine()
        println("Here are your restaurant choices:")
        if (choice[0].equals("yes", ignoreCase = true) && choice[1].equals(
                "yes",
                ignoreCase = true
            ) && choice[2].equals("yes", ignoreCase = true)
        ) {
            println("Corner's cafe")
            println("Chef's kitchen")
        } else if (choice[0].equals("yes", ignoreCase = true) && choice[1].equals(
                "yes",
                ignoreCase = true
            ) && choice[2].equals("no", ignoreCase = true)
        ) {
            println("Corner's cafe")
            println("Chef's kitchen")
        } else if (choice[0].equals("yes", ignoreCase = true) && choice[1].equals(
                "no",
                ignoreCase = true
            ) && choice[2].equals("yes", ignoreCase = true)
        ) {
            println("Main Street pizza company")
            println("Corner's cafe")
            println("Chef's kitchen")
        } else if (choice[0].equals("no", ignoreCase = true) && choice[1].equals(
                "yes",
                ignoreCase = true
            ) && choice[2].equals("yes", ignoreCase = true)
        ) {
            println("Corner's cafe")
            println("Chef's kitchen")
        } else if (choice[0].equals("yes", ignoreCase = true) && choice[1].equals(
                "no",
                ignoreCase = true
            ) && choice[2].equals("no", ignoreCase = true)
        ) {
            println("Main Street pizza company")
            println("Corner's cafe")
            println("Mama's fine Italian")
            println("Chef's kitchen")
        } else if (choice[0].equals("no", ignoreCase = true) && choice[1].equals(
                "no",
                ignoreCase = true
            ) && choice[2].equals("yes", ignoreCase = true)
        ) {
            println("Main Street pizza company")
            println("Corner's cafe")
            println("Chef's kitchen")
        } else if (choice[0].equals("no", ignoreCase = true) && choice[1].equals(
                "yes",
                ignoreCase = true
            ) && choice[2].equals("no", ignoreCase = true)
        ) {
            println("Corner's cafe")
            println("Chef's kitchen")
        } else if (choice[0].equals("no", ignoreCase = true) && choice[1].equals(
                "no",
                ignoreCase = true
            ) && choice[2].equals("no", ignoreCase = true)
        ) {
            println("Joe's gourmet burgers")
            println("Main Street pizza company")
            println("Corner's cafe")
            println("Mama's fine Italian")
            println("Chef's kitchen")
        }
    }
