package week06
// Florencio rueda 6.1 Text Adventure Nov 5 2022
import kotlin.system.exitProcess

var player = Player("", Room(""))

fun main(args: Array<String>) {
    println("move by hitting n,e,s,w")
    var foyer = Room("Foyer")
    var kitchen = Room("Kitchen")
    var hallway = Room("Hallway")
    var bedroom = Room("Bedroom")
    var bathroom = Room("Bathroom")



    player = Player("John, Faith", foyer)
    foyer.addRoom(hallway, Direction.EAST)
    hallway.actions[Direction.NORTH] = {
        println("the mirror has shattered by uglyness of your face, but it dropped a key ")
        println("you picked up the key")
        player.objects.add("key")
    }
    hallway.addRoom(kitchen, Direction.EAST)
    foyer.actions[Direction.NORTH] = {
        if (player.objects.contains("key")) {
            println("You used key to unlock the " + bedroom.name)
            println("You entered the " + bedroom.name)
            foyer.addRoom(bedroom, Direction.NORTH)
            player.room = bedroom
            player.objects.remove("key")
        } else {
            println("You found a locked door.")
        }
    }
    bedroom.addRoom(bathroom, Direction.WEST)
    bathroom.actions[Direction.WEST]={
        println("The tub is filling up with water and is over flowing.")
        bathroom.actions[Direction.EAST]={
            println("There is so much water that the door will not open.")
            println("The bathroom filled up water and you slowly drowned")
            exitProcess(0)
        }
    }
    while (true) {
        println(String.format("You are in %s , where to go next", player.room.name))
        val dir = readln()
        player.doAction(Direction.get(dir))
    }

}

class Player(playerName: String, startingRoom: Room) {
    var name = playerName
    var room = startingRoom
    var objects = ArrayList<String>()
    fun doAction(dir: Direction) {
        room.actions[dir]?.invoke()
    }
}

enum class Direction() {
    NORTH, SOUTH, EAST, WEST;

    companion object {
        fun get(dir: String): Direction {
            return when (dir) {
                "n" -> NORTH
                "s" -> SOUTH
                "e" -> EAST
                "w" -> WEST
                else -> SOUTH
            }
        }
    }
}

class Room(roomName: String) {
    val name = roomName
    val noAction = { println("Nothing to do there.") }
    val actions = mutableMapOf<Direction, () -> Unit>(
        Direction.NORTH to noAction,
        Direction.EAST to noAction,
        Direction.SOUTH to noAction,
        Direction.WEST to noAction
    )

    fun addRoom(room: Room, dir: Direction, connect: Boolean = true) {
        if (connect) {
            when (dir) {
                Direction.NORTH -> room.addRoom(this, Direction.SOUTH, false)
                Direction.EAST -> room.addRoom(this, Direction.WEST, false)
                Direction.SOUTH -> room.addRoom(this, Direction.NORTH, false)
                Direction.WEST -> room.addRoom(this, Direction.EAST, false)
            }
        }
        actions[dir] = {
            println(String.format("%s moved to %s", player.name, room.name))
            player.room = room
        }
    }
}
