class Game (var number: Number) {
    val guess = number.generate()

    fun compare(number: Int) : Boolean{
        if(number > guess) {
            println("Too small")
        } else if (number < guess) {
            println("Too big")
        }
        return number == guess
    }
}