package com.matteomalvezzi.OOP.arrays;

public class FizzBuzz {

    public static String[] fizzBuzz(int start, int end){
        String[] s = new String[end-start];
        int j = 0;
        for (int i = start; i < end; i++) {
            if(i%3 == 0 && i%5 == 0) s[j] = "FizzBuzz";
            else if(i%3 == 0) s[j] = "Fizz";
            else if(i%5 == 0) s[j] = "Buzz";
            else s[j] = String.valueOf(i);

            j++;
        }
        return s;
    }

}
