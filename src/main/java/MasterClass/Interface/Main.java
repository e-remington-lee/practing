package main.java.MasterClass.Interface;

public class Main {
    public static void main(String[] args) {
        ITelephone it;
        it = new Mobile();
        it.dial(555);
        it.powerOn();
        it.dial(555);

        it = new DeskPhone();
        it.powerOn();
    }
}
