package week04
//Florencio rueda 4.2 Letter Counter 09/24/22

    fun main(args: Array<String>) {
        var count = 0
        println("Please enter a string:")
        var mess = readLine()
        println("Please enter a character:")
        var letter = readLine()!![0]

        val messLen = mess !!.length

        for (i in 0  ..  messLen-1){
          if (mess[i]==letter) {
            }
        }
        println("You have $messLen characters and $count of them are the letter $letter")
    }
