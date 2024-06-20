package com.matteomalvezzi.OOP.functional;

import java.util.List;

public class TwoTwo {

    public static List<Integer> twoTwo(List<Integer> nums){
        return nums.stream()
                .map( n -> n*2)
                .filter( n -> n%10 != 2)
                .peek(System.out::println)
                .toList();
    }

}
