import java.util.Scanner;

public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;

    // No-argument constructor
    public Player() {
    }

    // Constructor
    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }


     // Getter methods
     public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
  
    // Check if player is alive
  public boolean isAlive() {
    return health > 0;
    }

     // Method to receive damage and update health
    public void receiveDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;  // Ensure health doesn't go below zero
        }
    }

    // Method for player to attack defender
    public void attack(Player defender) {
        int attackDiceRoll = rollDice(this); // Attacker rolls the dice
        int defendDiceRoll = rollDice(defender); // Defender rolls the dice

        int attackDamage = attack * attackDiceRoll;
        int defenseStrength = defender.strength * defendDiceRoll;
        int damageDealt = Math.max(0, attackDamage - defenseStrength);
        defender.receiveDamage(damageDealt);

        System.out.println(name + " attacks " + defender.getName() + " with attack dice roll " + attackDiceRoll +
                " and defense dice roll " + defendDiceRoll);
        System.out.println("Attack damage: " + attackDamage);
        System.out.println(defender.getName() + "'s defense strength: " + defenseStrength);
        System.out.println(defender.getName() + "'s health reduced by: " + damageDealt + " health remained " + defender.getHealth());
        System.out.println();
    }

    // Method to roll a dice
    public static int rollDice(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rolling the dice for " + player.getName() + ". Press Enter to roll...");
        scanner.nextLine();
        int diceRoll = (int) (Math.random() * 6) + 1; // Simulates rolling a 6-sided dice
        System.out.println(player.getName() + " rolled: " + diceRoll);
        return diceRoll;
    }

}