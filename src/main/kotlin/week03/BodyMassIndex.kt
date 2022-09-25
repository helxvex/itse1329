package week03
//Florencio rueda 3.3 Body Mass Index  9/22/22
import kotlin.math.pow
    fun main(args: Array<String>){
        println("Enter your weight (in pounds):")
        val weight = Integer.valueOf(readLine())
        println("Enter your height (in inches):")
        val height = Integer.valueOf(readLine())
        val bmi = (weight * 703) / height.toDouble().pow(2)
        println("Your BMI is:$bmi")
    }

/*
pseudocode code :
Println (need user weight)
user input integer.valueOf(readLine()) of weight
Println (need user height)
user input integer.valueOf(readLine()) of height
bmi math : (weight * 703) / height.toDouble().pow(2)
print result: bmi
 */