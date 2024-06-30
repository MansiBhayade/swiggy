import static org.junit.Assert.*;

import org.junit.Test;


public class MagicalArenaTest {
    
    @Test
    public void testGameFlowWithLessHealthAttacksFirst() {
        // Create players with specific health values
        Player player1 = new Player("Player1", 100, 20, 10);
        Player player2 = new Player("Player2", 80, 18, 12);

        // Create the arena with the two players
        MagicalArena arena = new MagicalArena(player1, player2);

      // Assert that player2 attacks first
        assertTrue("Player2 should attack first when it has less health",
                   arena.getAttacker() == player2 && arena.getDefender() == player1);


    }

    @Test
    public void testRandomSelectionWhenEqualHealth() {
        // Create two players with equal health values
        Player player1 = new Player("Player1", 100, 20, 10);
        Player player2 = new Player("Player2", 100, 18, 12); // Equal health

        // Create the arena with the two players
        MagicalArena arena = new MagicalArena(player1, player2);

        // Get the attacker and defender 
        Player attacker = arena.getAttacker();
        Player defender = arena.getDefender();

        // Verify that attacker and defender are either player1 and player2 in any order
        assertTrue(attacker == player1 && defender == player2 || attacker == player2 && defender == player1);
    }

    
}