import java.security.SecureRandom

class Game () : Number{
    var bound: Int = 100

    override fun generate() : Int{
        var secureRandom = SecureRandom()
        return secureRandom.nextInt(bound)
    }

    override fun compare(number: Int, guess: Int) : Boolean{
        if(number > guess) {
            println("Too small")
        } else if (number < guess) {
            println("Too big")
        }
        return number == guess
    }
}