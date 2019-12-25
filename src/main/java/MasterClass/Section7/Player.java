package main.java.MasterClass.Section7;

public class Player {
    public String weapon;
    public int health;
    public String name;

    public void loseHealth(int damage){
        this.health -= damage;
        if (this.health <= 0){
            System.out.println("player has died");
        }
    }

    public int remainingHp(){
        return this.health;
    }
}
