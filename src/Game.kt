import java.util.*

internal object Game {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello, World!")
        println(Dice.roll)
        var aList = List()
        var bList = aList.clone()

        println(bList.list)
        println(aList.list)
        println(bList.list.size)
        println(aList.equals(bList))

        var players: Array<Player> = arrayOf(
            Player("A"),
            Player("B"),
            Player("C")
        )

        init(players = players, gameID = UUID.randomUUID(), list = aList)

        for (player in players)
            println(player.playerName + " " + player.game)
    }

    fun init(players: Array<Player>, gameID: UUID, list: List) {
        for (player in players)
            player.initialize(gameID, list)
    }
}