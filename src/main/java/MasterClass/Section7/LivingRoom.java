package main.java.MasterClass.Section7;

public class LivingRoom {
    private int couch;
    private int tv;

    public LivingRoom(int couch, int tv) {
        this.couch = couch;
        this.tv = tv;
    }

    public void turnTvOn(){
        System.out.println(String.format("turning on the %d tv", this.tv));
    }

    public int getCouch() {
        return couch;
    }

    public int getTv() {
        return tv;
    }
}
