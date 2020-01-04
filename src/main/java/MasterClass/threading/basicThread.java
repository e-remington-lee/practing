package main.java.MasterClass.threading;

public class basicThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("hi"+ currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        }
        System.out.println("finished!");
    }
}
