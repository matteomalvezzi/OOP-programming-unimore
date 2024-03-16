package com.matteomalvezzi.OOP.strings;

public class RemoveFirstTwoCharsIf {

    public static String removeFirstTwoCharsIf(String string){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if(i == 0 && string.charAt(i) == 'H') s.append(string.charAt(i));
            else if(i == 1 && string.charAt(i) == 'e') s.append(string.charAt(i));
            else if(i > 1) s.append(string.charAt(i));
        }return s.toString();
    }

}
