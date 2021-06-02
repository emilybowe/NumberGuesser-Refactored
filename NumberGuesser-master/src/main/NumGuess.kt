import java.lang.NumberFormatException

fun main(args: Array<String>) {
    val game = Game()
    val num = game.generate()

    while (true) {
        println("Guess the number")
        try {
            if(game.compare(num, readLine()!!.toInt())) {
                break
            }
        } catch (e: NumberFormatException) {
            "Number is out of bounds"
        }
        //println(num)
    }
    println("You win!")
}