package week02
import java.util.Scanner
// Florencio rueda  2.7 Cookie Calorie Calculator 09/15/22
fun main(args: Array<String>){
    println("How many cookies have you ate?");
    var totalCookiesAte= Integer.valueOf(readLine())
    var caloriesInEach = 300/4;
    var totalCalories = totalCookiesAte*caloriesInEach;
    println("Total calories comsumed: $totalCalories");


}
