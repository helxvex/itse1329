package week03
//Florencio rueda 3.7 Restaurant Selector 09/25/22
import java.util.*

    fun main(args: Array<String>) {
        val n = Scanner(System.`in`)
        val vegetarian: String
        val vegan: String
        val gluten_free: String
        println("Is anyone in your party a vegetarian? [y/n]")
        vegetarian = n.nextLine()
        if (vegetarian == "y" || vegetarian == "n") {
            println("Is anyone in your party a vegan? [y/n] ")
            vegan = n.nextLine()
            if (vegan == "y" || vegan == "n") {
                println("Is anyone in your party a gluten-free? [y/n] ")
                gluten_free = n.nextLine()
                if (gluten_free == "y" || gluten_free == "n") {
                    println("Here are your restaurant choices:")
                    println("")
                    if (vegetarian == "y") {
                        if (vegan == "y") {
                            if (gluten_free == "y" || gluten_free == "n") {
                                println("   Corner Cafe")
                                println("   The Chef's Kitchen")
                            }
                        } else {
                            if (gluten_free == "y") {
                                println("   Main Street Pizza Company")
                                println("   Corner Cafe")
                                println("   The Chef's Kitchen")
                            } else {
                                println("   Main Street Pizza Company")
                                println("   Corner Cafe")
                                println("   Mama's Fine Italian")
                                println("   The Chef's Kitchen")
                            }
                        }
                    } else {
                        if (vegan == "y") {
                            if (gluten_free == "y" || gluten_free == "n") {
                                println("   Corner Cafe")
                                println("   The Chef's Kitchen")
                            }
                        } else {
                            if (gluten_free == "y") {
                                println("   Main Street Pizza Company")
                                println("   Corner Cafe")
                                println("   The Chef's Kitchen")
                            } else {
                                println("   Joe's Gourmet Burgers")
                                println("   Main Street Pizza Company")
                                println("   Corner Cafe")
                                println("   Mama's Fine Italian")
                                println("   The Chef's Kitchen")
                            }
                        }
                    }
                }
            }
        }
    }
