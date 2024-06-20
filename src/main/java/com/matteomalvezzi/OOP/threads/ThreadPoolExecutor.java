package com.matteomalvezzi.OOP.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

public class ThreadPoolExecutor {


    private static final int N_TASK = 8;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        RandomGenerator r = RandomGenerator.getDefault();

        for(int i = 0; i < N_TASK; i++){

            int ntask = i;
            executor.submit( () -> {

                long start = System.nanoTime();

                Thread current_thread = Thread.currentThread();
                System.out.printf("START thread=Thread-%s task=%s\n", current_thread.getName(), ntask);
                try {
                    Thread.sleep(r.nextInt(999));
                } catch (InterruptedException ignored) {

                }

                long end = System.nanoTime();
                System.out.printf("START thread=Thread-%s task=%s t=%d ms\n", current_thread.getName(), ntask, TimeUnit.NANOSECONDS.toMillis(end - start));
            });
        }
        executor.close();
    }
}
