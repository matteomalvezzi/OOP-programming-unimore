package com.matteomalvezzi.OOP.strings;

public class Concatenate {

    public static String concatenate(String[] strings){
        StringBuilder s = new StringBuilder();
        for (String string : strings) {
            s.append(string);
        }return s.toString();
    }
}
