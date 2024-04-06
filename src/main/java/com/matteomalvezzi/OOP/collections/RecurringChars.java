package com.matteomalvezzi.OOP.collections;

import java.util.HashSet;
import java.util.Set;

public class RecurringChars {

    public static Set<Character> recurringChars(String string){
        Set<Character> reccurring = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {

            char c = string.charAt(i);
            if(string.substring(i+1).indexOf(c) != -1) reccurring.add(c);

        }
        return reccurring;
    }
}
