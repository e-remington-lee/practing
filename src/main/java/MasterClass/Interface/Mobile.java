package main.java.MasterClass.Interface;

public class Mobile implements ITelephone {
    private boolean power;
    private int phone;

    @Override
    public void powerOn() {
        this.power = true;
        System.out.println("power on");
    }

    @Override
    public void dial(int phone) {
        if(power){
            System.out.println("dial: "+phone);
        } else {
            System.out.println("phone is not on");
        }
    }

    @Override
    public void answer() {

    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
