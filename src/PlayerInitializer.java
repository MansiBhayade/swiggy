import java.util.Scanner;

public class PlayerInitializer {
          public static Player inputPlayerInfo(Scanner scanner) {
        System.out.println("Enter player name:");
        String name = scanner.nextLine();

        int health = inputPositiveInteger(scanner, "Enter player health (must be a positive integer):");
        int strength = inputPositiveInteger(scanner, "Enter player strength (must be a positive integer):");
        int attack = inputPositiveInteger(scanner, "Enter player attack (must be a positive integer):");

        return new Player(name, health, strength, attack);
    }
    private static int inputPositiveInteger(Scanner scanner, String prompt) {
        int value;
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();
            try {
                value = Integer.parseInt(input);
                if (value > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        return value;
    }
}
