package com.matteomalvezzi.OOP.functional;

import java.util.List;

public class SquareFive {


    public static long squareFive(List<Integer> nums){
        return nums.stream()
                .map(n-> Math.pow(n, 2))
                .map(n -> n+10)
                .filter( n -> n%10 != 5)
                .peek(System.out::println)
                .count();
    }
}
