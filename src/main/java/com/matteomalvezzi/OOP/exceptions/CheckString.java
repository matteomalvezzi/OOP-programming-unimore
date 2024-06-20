package com.matteomalvezzi.OOP.exceptions;

import java.text.ParseException;

public class CheckString {

    public static void checkString(String s) throws ParseException {
        char[] chars = s.toCharArray();

        if (s.length() < 2) {
            throw new ParseException(s, 0);
        }

        for (int i = 0; i < chars.length; i++) {
            if(i != chars.length-1){
                if(Character.isLetter(chars[i])){
                    if(Character.isLetter(chars[i+1])) throw new ParseException(s, i);
                } else if (Character.isDigit(chars[i])) {
                    if(i == 0) throw new ParseException(s, i);
                }
            }
        }
    }
}
