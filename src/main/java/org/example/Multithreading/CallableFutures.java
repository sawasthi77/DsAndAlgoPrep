package org.example.Multithreading;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class CallableFutures {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();

        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                int duration = random.nextInt();
                if(duration > 2000){
                    throw new IOException("Sleeping for too long");
                }
                System.out.println("Starting....");
                Thread.sleep(duration);
                System.out.println("Finished.....");
                return duration;
            }
        });

        executor.shutdown();
        System.out.println("Future Result " + future.get());
    }
}
