package main.java.MasterClass.threading.ConsumerProducer;

import java.util.Random;

public class ProducerConsumer {
    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Reader(message))).start();
        (new Thread(new Writer(message))).start();
//        (new Thread(new Reader(message))).start();
    }
}

class Message {
    private String message;
    private boolean empty = true;
    public synchronized String read(){
        while(this.empty){
            System.out.println("reader -- waiting..");
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("reader - reading");
        this.empty = true;
        notifyAll();
        return this.message;
    }

    public synchronized void write(String message){
            while(!this.empty) {
                System.out.println("writter -- waiting");
                try {
                    wait();
                } catch (InterruptedException e) {

                }
            }
        System.out.println("writter -- doing");
        this.empty = false;
        this.message = message;
        notifyAll();
    }
}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message){
        this.message = message;
    }

    @Override
    public void run() {
        String[] messages = {
                "Humpty dumpty sat on a wall",
                "Humpty dumpty had a great fall",
                "all the kings horses and all the kings men",
                "couldn't put him back together again"
                };

        Random random = new Random();

        for (String m : messages){
            message.write(m);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // this breaks the code, not sure why
//            message.write("Finished!");
        }
        message.write("Finished!");
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (String latestString = message.read(); !latestString.equalsIgnoreCase("Finished!");
            latestString = message.read()) {
            System.out.println(latestString);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
