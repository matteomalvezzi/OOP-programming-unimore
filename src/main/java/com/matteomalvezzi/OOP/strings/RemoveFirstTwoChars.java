package com.matteomalvezzi.OOP.strings;

public class RemoveFirstTwoChars {

    public static String removeFirstTwoChars(String string){
        StringBuilder s = new StringBuilder();
        if(string.length()<= 2) return "";

        for (int i = 2; i < string.length(); i++) {
            s.append(string.charAt(i));
        }return s.toString();
    }
}
