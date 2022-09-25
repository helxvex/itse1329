package week04
//Florencio rueda 4.2 Letter Counter 09/24/22
import java.util.*


    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        println("Please enter a string:")
        val s = `in`.nextLine()
        println("Please enter a character:")
        val ch = `in`.next()[0]

        var count = 0
        for (i in 0 until s.length) {
            if (s[i] == ch) ++count
        }
        println(count)
    }
