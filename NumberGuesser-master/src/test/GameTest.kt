import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class GameTest {
    @Test
    fun test1() {

        var game = Game(FixedNumber())
        assertFalse { game.compare(4) }
        assertTrue { game.compare(5) }

    }


}
