package org.example.Multithreading;

public class App1 extends Thread {
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

class Main {
    public static void main(String[] args) {
        App1 t1 = new App1();
        App1 t2 = new App1();
        t1.start();
        t2.start();
    }
}
