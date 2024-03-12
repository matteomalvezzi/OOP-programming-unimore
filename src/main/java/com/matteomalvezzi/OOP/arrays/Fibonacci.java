package com.matteomalvezzi.OOP.arrays;

public class Fibonacci {

    public static long[] fibonacci(int n){
        long[] sequence = new long[n];
        sequence[0] = 0;
        if(n == 1) return sequence;
        else{
            sequence[1] = 1;

            if(n == 2) return sequence;
            else{
                for (int i = 2; i < n; i++) sequence[i] = sequence[i-1] + sequence[i-2];
            }
        }
        return sequence;
    }
}
