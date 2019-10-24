class Round(var id: Int) {
    var roundId: Int = id
    var letter: Dice.Letter = Dice.roll

    // Scoring outline for valid responses:
    // if unique: 10
    // if duplicate: 5
    // if blank: 0
    // @return: map of player id and score
    fun score(players: Array<Player>): Map<Int, Int> {
        // TODO
        // idea: create an array of all player's responses, iterate through each player and check if response exists in array

        // array of players
        // players[i].responses[roundId] is the List (hashmap) of a player's responses


    }

    // TODO: implement response validity
    fun validResponse(response: Array<List>): Boolean {
        return true
    }

}