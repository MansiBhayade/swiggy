public class MagicalArena {

    private Player player1;
    private Player player2;
    private Player attacker;
    private Player defender;

    public MagicalArena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;


        if(player1.getHealth()<player2.getHealth())
         {
            attacker=player1;
            defender=player2;
         }
         else if(player1.getHealth()>player2.getHealth())
         {
            attacker=player2;
            defender=player1;
         }
         else
         {
            // If both players have the same health, choose randomly
            if(Math.random()>0.5){
                attacker=player1;
                defender=player2;
            }
            else{
                attacker=player2;
                defender=player1;
            }
         }
    }

    public Player getAttacker() {
        return attacker;
    }

    public Player getDefender() {
        return defender;
    }


    public void startGame() {
        System.out.println("----- Starting Magical Arena Game -----");
        System.out.println(player1.getName() + " vs " + player2.getName());
        System.out.println();

         

         // Game loop
         while (player1.isAlive() && player2.isAlive()) {
            attacker.attack(defender);
            if (!defender.isAlive()) {
                break;
            }

            // Swap roles for the next turn
            Player temp = attacker;
            attacker = defender;
            defender = temp;

            // Add some delay for readability in console output
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        announceWinner();

    }
    
    private void announceWinner() {
        if (!player1.isAlive()) {
            System.out.println(player2.getName() + " wins the game!");
        } else if (!player2.isAlive()) {
            System.out.println(player1.getName() + " wins the game!");
        } else {
            System.out.println("It's a draw!");
        }
    }
    
    
}
