package main.java.MasterClass.Section7;

public class EncapPlayer {
    private String weapon;
    private int health = 50;
    private String name;

    public EncapPlayer(String weapon, int health, String name) {
        this.name = name;
        if (health > 0 && health <=100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health -= damage;
        if (this.health <= 0){
            System.out.println("player has died");
        }
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
}
