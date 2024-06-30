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
}