package main.java.MasterClass.Section7;

public class Car {
    private int wheels = 4;
    private boolean engine = true;
    private int cyllinders;
    private String name;

    public Car(int cyllinders, String name) {
        this.cyllinders = cyllinders;
        this.name = name;
    }

    public void start(){
        System.out.println("starting car engine");
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCyllinders() {
        return cyllinders;
    }

    public String getName() {
        return name;
    }
}

class Acura extends Car {
    public Acura(int cyllinders, String name) {
        super(cyllinders, name);
    }

    @Override
    public void start(){
        System.out.println(String.format("%s is starting", getClass().getSimpleName()));
    }
}

class PineWoodCar extends Car {
    public PineWoodCar(int cyllinders, String name) {
        super(cyllinders, name);
    }

    @Override
    public void start() {
        super.start();
    }
}


class Main2 {
    public static void main(String[] args) {
        Acura acura = new Acura(4, "fav");
        PineWoodCar pine = new PineWoodCar(0,"boy scouts");

        acura.start();
        pine.start();

        Car ford = new Car(4, "ford") {
            private int speed = 10;
            @Override
            public void start(){
                System.out.println("starting the ford!");
                System.out.println(speed);
            }
        };
        ford.start();
    }
}
