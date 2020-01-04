package main.java.MasterClass.threading;

public class Main {
    public static void main(String[] args) {
        Thread at = new basicThread();
        at.start();


        new Thread() {
            public void run(){
                System.out.println("running from: "+ currentThread().getName());
                try {
                    at.join();
                } catch (InterruptedException e) {
                    System.out.println("bad, bad bad");
                }
            }
        }.start();

        Thread rt = new Thread(new RunThread());
        rt.start();



    }
}
