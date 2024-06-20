package com.matteomalvezzi.OOP.threads;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

public class ThreadPool extends Thread{

    private static final int N_TASK = 8;

    public ThreadPool(String name) {
        super(name);
    }

    @Override
    public void run() {
        RandomGenerator r = RandomGenerator.getDefault();
        long start = System.nanoTime();

        System.out.printf("START thread=Thread-%s task=%s\n", getName(), getName());
        try {
            Thread.sleep(r.nextInt(999));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long end = System.nanoTime();
        System.out.printf("START thread=Thread-%s task=%s t=%d ms\n", getName(), getName(), TimeUnit.NANOSECONDS.toMillis(end - start));
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadPool[] threads = new ThreadPool[8];
        for (int i = 0; i < 8; i ++) {

            threads[i] = new ThreadPool(String.valueOf(i));
            threads[i].start();
        }

        for (ThreadPool thread : threads) {
            thread.join();
        }

    }
}
