import java.security.SecureRandom

class RandomNumber(val bound: Int) : Number {

    override fun generate() : Int{
        var secureRandom = SecureRandom()
        return secureRandom.nextInt(bound)
    }


}