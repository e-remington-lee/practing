package main.java.MasterClass.threading;

public class RunThread implements Runnable {

    @Override
    public void run() {
        System.out.println("running from runnable: "+ getClass().getName());
    }
}
