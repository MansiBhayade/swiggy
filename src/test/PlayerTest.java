import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testReceiveDamage() {
        Player player = new Player("Player1", 100, 10, 5);
        player.receiveDamage(30);
        assertEquals(70, player.getHealth());
    }

    @Test
    public void testPlayerDiesWhenHealthIsZero() {
        Player player = new Player("Player1", 100, 10, 5);
        player.receiveDamage(100);
        assertFalse(player.isAlive());
    }

}
