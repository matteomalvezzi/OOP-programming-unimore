package com.matteomalvezzi.OOP.functional;

import java.util.List;

public class OneTen {

    public static List<Integer> oneTen(List<Integer> nums) {
        return nums.stream()
                .map( n -> (n + 1) * 10)
                .toList();
    }
}
