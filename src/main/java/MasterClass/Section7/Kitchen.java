package main.java.MasterClass.Section7;

public class Kitchen {
    private int stove;
    private int fridge;

    public Kitchen(int stove, int fridge) {
        this.stove = stove;
        this.fridge = fridge;
    }

    public void cook (){
        System.out.println("cooking on the stove");
    }

    public int getStove() {
        return stove;
    }

    public int getFridge() {
        return fridge;
    }
}
