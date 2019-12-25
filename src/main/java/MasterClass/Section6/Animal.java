package main.java.MasterClass.Section6;

public class Animal {
    private String color;
    private int weight;
    private String name;
    private int brain;

    public Animal(int weight, int brain, String color, String name) {
        this.weight = weight;
        this.brain = brain;
        this.color = color;
        this.name = name;
    }



    public void eat(){
        System.out.println("eating");
    }

    public void move(int speed){
        System.out.println(String.format("Moving at %d mps!!", speed));
    }

    public int getBrain() {
        return brain;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
