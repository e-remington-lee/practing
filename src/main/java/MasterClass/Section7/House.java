package main.java.MasterClass.Section7;

public class House {
    private LivingRoom room;
    private Kitchen kitchen;

    public House(LivingRoom room, Kitchen kitchen) {
        this.room = room;
        this.kitchen = kitchen;
    }

    public void watchTv(){
        room.turnTvOn();
        System.out.println("watching tv");
    }

    public void cook(){
        x().cook();
        System.out.println("cooking");
    }

    private Kitchen x() {
        return this.kitchen;
    }
}
