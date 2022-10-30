package week05


        fun main(args: Array<String>) {

            //creating scanner object
           // val ob = readLine()

            //infinite loop
            while (true) {
                //calling userChoice method
                val user = userChoice()

                //calling computerChoice() method
                val computer = computerChoice()

                //determining the winner
                determineWinner(user, computer)

                //play again choice
                val r = playAgain()
                if (r == true) continue else break
            }
        }

        //method to get the user choice
        fun userChoice(): Char {
            //menu
            println(" 1. rock (r)")
            println(" 2. paper (p)")
            println(" 3. scissors (s)")

            //creating scanner object
            val ob2 = readLine()
            print("Enter your choice: ")

            //getting user choice
            val c = ob2
            return c!!.first()
        }

        //method for computer choice
        fun computerChoice(): Char {
            val min = 1
            val max = 3

            //creating random object
            val rand = Math.random()

            //generating random number between 1 and 3
            val randomNum = (rand * (max - min + 1) + min).toInt()


            //returning the corresponding character
            if (randomNum == 1) return 'r'
            if (randomNum == 2) return 'p'
            return if (randomNum == 3) 's' else Character.MIN_VALUE
        }

        //method to determine the winner
        fun determineWinner(user: Char, computer: Char ) {
            //depends upon the choice of user and computer any one of the block will be executed
            if (user == computer) println("\nDraw!") else if (user == 'r') {
                if (computer == 'p') println("\nYou lose! paper covers rock") else println("\nYou win! rock smashes scissors")
            } else if (user == 'p') {
                if (computer == 's') println("\nYou lose! Scissors cut paper") else println("\nYou win! paper covers rock")
            } else if (user == 's') {
                if (computer == 'r') println("\nYou lose... rock smashes scissors") else println("\nYou win! Scissors cut paper")
            }
        }

        //method to get the choice of continuing the game
        fun playAgain(): Boolean {
            val ob3 = readLine()
            print("\n\nDo you want to play Again (y/n): ")
            val c = ob3
            if (c!!.first() == 'y') return true
            return if (c[0] == 'n') false else false
        }
