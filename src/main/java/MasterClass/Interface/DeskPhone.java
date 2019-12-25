package main.java.MasterClass.Interface;

public class DeskPhone implements ITelephone {

    @Override
    public void powerOn() {
        System.out.println("powering desk phone on");
    }

    @Override
    public void dial(int phone) {
        System.out.println("dialing: "+phone);

    }

    @Override
    public void answer() {

    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
