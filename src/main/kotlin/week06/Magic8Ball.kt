package week06

//Florencio rueda 6.2 Magic 8 Ball Oct 30 2022

fun main(args: Array<String>) {

    var response = arrayOf("Yes, of course!\n","Without a doubt, yes.\n","You can count on it.\n"
        ,"For sure!\n","Ask me later.\n","I’m not sure.\n","I can’t tell you right now. I’ll tell you after my nap. No way!\n"
        ,"I don’t think so.\n","Without a doubt, no.\n","The answer is clearly NO.\n")

    while(true) {
        val  randomResponse = response.random()
        println("Ask any question:")
        var myQuestion = readLine()


        if (myQuestion == "stop") break
        print(randomResponse)

    }
    println(" You have stopped playing ")
}