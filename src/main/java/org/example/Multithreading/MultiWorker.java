package org.example.Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultiWorker {

    private Random random = new Random();
    Object lock1 = new Object();
    Object lock2 = new Object();

    private static List<Integer> list1 = new ArrayList<>();
    private static List<Integer> list2 = new ArrayList<>();

    public void stage1(){
        synchronized (lock1){
            try{
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list1.add(random.nextInt());
        }
    }

    public void stage2(){
        synchronized (lock2){
            try{
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list2.add(random.nextInt());
        }
    }

    public void process(){
        for(int i = 0; i < 1000; i++){
            stage1();
            stage2();
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting.....");
        long start = System.currentTimeMillis();
        MultiWorker multiWorker = new MultiWorker();

        Thread t1 = new Thread(multiWorker::process);
        Thread t2= new Thread(multiWorker::process);

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken "+ (end - start));
        System.out.println("List1 size is  "+ list1.size() + " List2 Size is  " + list2.size());
    }
}
