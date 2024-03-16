package com.matteomalvezzi.OOP.strings;

public class Reverse {

    public static String reverse(String string){
        StringBuilder s = new StringBuilder();
        for (int i = string.length()-1; i >= 0; i--) {
            s.append(string.charAt(i));
        }return s.toString();
    }
}
