package org.example.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool implements Runnable{

    private int id;

    public ThreadPool(int id){
        this.id = id;
    }
    @Override
    public void run() {
        System.out.println("Starting: " + id);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Completed: " + id);
    }
}

class ThreadPollApp {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);
        for(int i = 0; i < 5; i++){
            service.submit(new ThreadPool(i));
        }

        service.shutdown();

        service.awaitTermination(1, TimeUnit.DAYS);
    }
}
