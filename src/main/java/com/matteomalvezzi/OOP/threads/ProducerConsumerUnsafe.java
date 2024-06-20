package com.matteomalvezzi.OOP.threads;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ProducerConsumerUnsafe {

    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> deque = new ConcurrentLinkedDeque<>();
        Producer producer = new Producer(deque);
        Consumer consumer = new Consumer(deque);

        producer.start();
        consumer.start();

        Thread.sleep(100);

        producer.interrupt();
        consumer.interrupt();

        producer.join();
        consumer.join();

    }

    public static class Producer extends Thread{
        private final Queue<Integer> queue;
        public Producer(Queue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {

            while (!interrupted()){
                queue.add(1);
            }

        }
    }

    public static class Consumer extends Thread{

        private final Deque<Integer> queue;

        public Consumer(Deque<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            int counter = 0;
            while (!interrupted()){
                try {

                    counter++;
                    queue.removeLast();
                } catch (NoSuchElementException e) {
                    Thread.yield();
                }
            }
            System.out.println("Number of consumed integer = " + counter);
        }
    }

}
