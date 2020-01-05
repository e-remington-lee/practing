package main.java.MasterClass.threading.threadDebugging;

public class ThreadMain {
    public static void main(String[] args) {
        CountDown cd = new CountDown();
    Thread t1 = new Thread(new CountDownThread(cd));
    t1.setName("Thread 1");
    Thread t2 = new Thread(new CountDownThread(cd));
    t2.setName("Thread 2");
    Thread t3 = new Thread(new CountDownThread(cd));


    t3.start();
    t1.start();
    t2.start();
    }
}

class CountDown {
    int i;
    public void doCount(){
        String color;
        switch(Thread.currentThread().getName()) {
            case "Thread 1":
                color = Colors.ANSI_CYAN;
                break;
            case "Thread 2":
                color = Colors.ANSI_BLUE;
                break;
            default:
                color = Colors.ANSI_RED;
        }

        synchronized (color) {
            for (i=12; i>0; i--) {
                System.out.println(color + Thread.currentThread().getName() + " "+i);
            }
        }

    }
}

class CountDownThread implements Runnable {
    private CountDown threadCounter;

    public CountDownThread(CountDown countDown) {
        threadCounter = countDown;
    }

    public void run() {
        threadCounter.doCount();
    }
}