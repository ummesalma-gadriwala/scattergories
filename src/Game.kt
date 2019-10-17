
internal object Game {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello, World!")
        println(Dice.roll)
        var l = List.getList()
        println(l.size)
        println(l)
    }
}