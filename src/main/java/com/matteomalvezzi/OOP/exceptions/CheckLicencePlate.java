package com.matteomalvezzi.OOP.exceptions;

public class CheckLicencePlate {

    public static void checkLicencePlate(String licence){
        char[] words = licence.toCharArray();
        if(words.length != 7) throw new IllegalArgumentException();

        if( !(Character.isDigit(words[2]) && Character.isDigit(words[3]) && Character.isDigit(words[4]) ) ) throw new IllegalArgumentException();

        if( !(Character.isLetter(words[0]) && Character.isLetter(words[1]) && Character.isLetter(words[5]) && Character.isLetter(words[6])) ) throw new IllegalArgumentException();


    }
}
