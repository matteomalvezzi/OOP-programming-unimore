package com.matteomalvezzi.OOP.strings;

public class GoodAtTheBeginning {

    public static boolean goodAtTheBeginning(String string){
        if (string.length() < 4) return false;
        if(string.charAt(0) == 'g' &&
           string.charAt(1) == 'o' &&
           string.charAt(2) == 'o' &&
           string.charAt(3) == 'd') return true;
        return false;
    }

    public static boolean goodAtTheBeginningMinimized(String string){
        if (string.length() < 4) return false;
        return string.charAt(0) == 'g' &&
                string.charAt(1) == 'o' &&
                string.charAt(2) == 'o' &&
                string.charAt(3) == 'd';
    }

    public static boolean goodAtTheBeginningVer2(String string){
        if (string.length() < 4) return false;

        return string.startsWith("good");
    }

}
