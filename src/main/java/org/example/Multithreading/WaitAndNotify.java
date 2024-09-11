package org.example.Multithreading;

import java.util.Scanner;

public class WaitAndNotify {

    public void produce()throws InterruptedException{
        synchronized (this){
            System.out.println("Producer thread running");
            wait();
            System.out.println("Resumed..");
        }
    }

    public void consumer()throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        Thread.sleep(2000);
        synchronized (this){
            System.out.println("Waiting for return key");
            sc.nextLine();
            System.out.println("Return key pressed");
            notify();
        }
    }
}

class AppNW{
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify waitAndNotify = new WaitAndNotify();

        Thread t1 = new Thread(() -> {
            try {
                waitAndNotify.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                waitAndNotify.consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}
