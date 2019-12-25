package main.java.MasterClass.Section6;

public class Spider extends Animal{
    private int eyes;
    private int legs;
    private String venom;
    private String type;

    public Spider(int weight, String color, String name, int eyes, int legs, String venom, String type) {
        super(weight, 1, color, name);
        this.eyes = eyes;
        this.legs = legs;
        this.venom  = venom;
        this.type = type;
    }

    public void eat(){
        System.out.println("using venom to devour!");
    }

    @Override
    public void move(int speed){
        System.out.println(String.format("moving with 8 legs at %d", speed));
    }

    public void walk(){
        System.out.println(String.format("moving with %d legs and %d eyes", this.legs, this.eyes));
        move(10);
    }
}
