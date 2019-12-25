package main.java.MasterClass.Section6;

public class Car extends Vehicle{
    private int doors;
    private int wheels;
    private String color;
    private int gears;

    public Car(){
        this("black");
    }

    public Car(String color) {
        this(4,4, color);
    }

    public Car(int doors, int wheels, String color) {
        super(1);
        this.doors = doors;
        this.wheels = wheels;
        this.color = color;
        this.gears= 1;
    }

    @Override
    public void move(int speed){
        System.out.println(String.format("Moving at %d on 4 wheels", speed));
        super.move(speed);
    }

    public void changeGears(int gears){
        this.gears = gears;
        System.out.println(String.format("changed gears to %d", gears));
    }

    public void steer(){
        System.out.println("steering with a regular wheel");
    }

    public void setDoors(int x){
        this.doors = x;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}


