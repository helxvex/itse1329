package week03
//Florencio rueda  3.7 Restaurant Selector  9/22/24

    fun main(args: Array<String>) {
        val choice = arrayOf("", "", "")
        println("Is anyone at your party vegetarian: yes or no")
        choice[0] = readln()
        println("Is anyone at your party a vegan: yes or no")
        choice[1] = readln()
        println("Is anyone at your party gluten free: yes or no")
        choice[2] = readln()
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
