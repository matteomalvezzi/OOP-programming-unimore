package com.matteomalvezzi.OOP.threads;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class DayChangeCheck extends Thread{

    @Override
    public void run() {
        System.out.println(getName() + " started!");
        while (!interrupted()) {
            LocalDate check = LocalDate.now();

            try {
                Thread.sleep(TimeUnit.MINUTES.toMillis(15));
            } catch (InterruptedException ignored) {

            }

            LocalDate now = LocalDate.now();
            if (now.getDayOfMonth() != check.getDayOfMonth()) {
                System.out.println(getName() + " the day of month changed");
            }
        }
        System.out.println(getName() + " terminated");
    }

    public static void main(String[] args) {
        DayChangeCheck t1 = new DayChangeCheck();
        t1.start();
    }
}
