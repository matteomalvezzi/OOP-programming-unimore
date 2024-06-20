package com.matteomalvezzi.OOP.functional;


import java.util.List;

public class NoTeen {

    public static List<Integer> noTeen(List<Integer> nums){
        return nums.stream()
                .filter( (n)-> n < 13 || n > 19)
                .peek(System.out::println)
                .toList();
    }
}
