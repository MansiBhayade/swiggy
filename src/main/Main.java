import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create player A
        Player playerA = new Player();  //PlayerA refers to Player1
        System.out.println("Enter details for Player A:");
         playerA = PlayerInitializer.inputPlayerInfo(scanner);

        // Create player B
        Player playerB = new Player();  //PlayerB refers to Player2
        System.out.println("Enter details for Player B:");
        playerB = PlayerInitializer.inputPlayerInfo(scanner);

   

    // Start the game
    MagicalArena arena = new MagicalArena(playerA, playerB);
    arena.startGame();


    }
    
}

