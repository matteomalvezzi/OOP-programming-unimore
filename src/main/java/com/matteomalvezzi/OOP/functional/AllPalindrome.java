package com.matteomalvezzi.OOP.functional;

import java.util.List;

public class AllPalindrome {


    public static boolean allPalindrome(List<String> strings){
        long np = strings.stream()
                .filter( s -> new StringBuilder(s).reverse().toString().equals(s))
                .count();
        return np == strings.size();
    }
}
