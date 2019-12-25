package main.java.MasterClass.Section6;

public class Vehicle {
    private int body;

    public Vehicle(int body) {
        this.body = body;
    }

    public void move(int speed){
        System.out.println(String.format("Moving at regular %d speed", speed));
    }

}
