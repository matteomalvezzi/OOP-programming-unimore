package com.matteomalvezzi.OOP.strings;

import java.util.Arrays;

public class DuplicateChars {

    public static char[] duplicateChars(String string){

        if(string.length() <2) return new char[0];

        StringBuilder s = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
        //for each character inner string we check if there is same character in a substring that start from character itself+1

            for (int j = i+1; j < string.length(); j++) {

                if(string.charAt(i) == string.charAt(j) ) {
                    s.append(string.charAt(i));

                    break;
                };
            }
        }
        char[] order_array = s.toString().toCharArray();
        Arrays.sort(order_array);
        return order_array;
    }

    public static char[] duplicateCharsVer2(String string){

        //we can use directly substring to find character
        if(string.length() <2) return new char[0];
        else if(string.length() == 2) {
            if (string.charAt(0) == string.charAt(1)) return new char[]{string.charAt(0)};
        }

        StringBuilder s = new StringBuilder();

        for (int i = 0; i < string.length()-1; i++) {

            String substring = string.substring(i+1, string.length()-1);
            char el = string.charAt(i);
            if(substring.indexOf(el) != -1) s.append(el);
        }
        char[] order_array = s.toString().toCharArray();
        Arrays.sort(order_array);
        return order_array;
    }
}
