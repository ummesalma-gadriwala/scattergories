import java.util.*

data class Player(var playerName: String) {
    var name: String = playerName.toLowerCase()

    // unique ID
    var uid: UUID = UUID.randomUUID()

    // total game score
    var score: Int = 0
        private set(value: Int) {
            field = value
        }

    // array recording player's score in each round
    private var roundScore: Array<Int> = emptyArray()

    // is the player part of a game?
    var game: Boolean = false
        get(): Boolean {
            return field
        }
        private set(value: Boolean) {
            field = value
        }

    // unique game ID player is associated with
    var gameUID: UUID = UUID(0, 0)
        get(): UUID {
            return field
        }
        private set(value: UUID) {
            field = value
        }

    // array recording player's response from each round
    private var responses: Array<List> = emptyArray()

    // initialize a new player with game ID and category list
    fun initialize(gameID: UUID, list: List) {
        this.game = true
        this.gameUID = gameID
        this.score = 0;
        // using clones to avoid overwriting responses between players
        for (i in 1..Constants.NumberOfRounds) {
            this.responses += list.clone()
        }
    }

    // record response of particular round
    fun roundResponse(roundID: Int, response: List) {
        this.responses[roundID] = response.clone();
    }

    // record round score and update total game score
    fun roundScore(roundID: Int, score: Int) {
        this.roundScore[roundID] = score
        this.score = this.score + score
    }
}