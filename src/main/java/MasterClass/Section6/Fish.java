package main.java.MasterClass.Section6;

public class Fish extends Animal {
    private int gills;
    private String type;
    private int eyes;

    public Fish(){
        super(1,2,"bob", "x");
    }

    public Fish(int weight, String color, String name, int gills, String type, int eyes) {
        super(weight, 1, color, name);
        this.gills = gills;
        this.type = type;
        this.eyes = eyes;
    }

    private void rest(){
        System.out.println("is resting");
    }

    private void moveMuscles(){

    }

    private void moveBackFins(){

    }

    public void swim(){
        moveMuscles();
        moveBackFins();
        super.move(10);
    }
}
