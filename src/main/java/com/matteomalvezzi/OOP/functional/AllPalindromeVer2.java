package com.matteomalvezzi.OOP.functional;

import java.util.List;

public class AllPalindromeVer2 {

    public static boolean allPalindrome(List<String> strings){
        return strings.stream()
                .allMatch(AllPalindromeVer2::isPalindrome);
    }
    public static boolean isPalindrome(String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
