import java.lang.NumberFormatException

fun main(args: Array<String>) {
    val game = Game(RandomNumber(100))

    while (true) {
        println("Guess the number")
        try {
            if(game.compare(readLine()!!.toInt())) {
                break
            }
        } catch (e: NumberFormatException) {
            "Number is out of bounds"
        }
        //println(num)
    }
    println("You win!")
}