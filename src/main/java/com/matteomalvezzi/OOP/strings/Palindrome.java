package com.matteomalvezzi.OOP.strings;

public class Palindrome {

    public static boolean isPalindrome(String string){

        if(string.isEmpty() || string.length() == 1) return true;

        StringBuilder reverse = new StringBuilder(string).reverse();
        return reverse.toString().equals(string);
    }

    public static boolean isPalindromeVer2(String string){

        if(string.isEmpty() || string.length() == 1) return true;

        StringBuilder reverse = new StringBuilder();

        //Manually reverse
        for (int i = string.length()-1; i >= 0; i--) {
            reverse.append(string.charAt(i));
        }
        return reverse.toString().equals(string);
    }
}
