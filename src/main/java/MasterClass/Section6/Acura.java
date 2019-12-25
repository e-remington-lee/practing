package main.java.MasterClass.Section6;

public class Acura extends Car {
    private String brand;

    public Acura(String brand){
        super(4,5,"blue");
        this.brand = brand;
    }

    @Override
    public void changeGears(int gears){
        System.out.println(String.format("changed gears to %d in acura", gears));
        changeGears();
    }

    public void changeGears(){
        System.out.println("super fast!!!!");
    }
}
