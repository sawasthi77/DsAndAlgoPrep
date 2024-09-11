package org.example.Multithreading;

import java.util.Scanner;

public class VolatileProcessor extends Thread{
    private volatile boolean running = true;
    @Override
    public void run(){
        while(running){
            System.out.println("Hello");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        running = false;
    }
}

class App{

    public static void main(String[] args) {
        VolatileProcessor t1 = new VolatileProcessor();
        t1.start();

        System.out.println("Press Enter to stop");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        t1.shutdown();
    }
}
