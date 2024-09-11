package org.example.Multithreading;

public class App2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new App2());
        Thread t2 = new Thread(new App2());
        t1.start();
        t2.start();
    }
}
