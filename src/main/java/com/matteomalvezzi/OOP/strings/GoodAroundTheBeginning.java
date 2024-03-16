package com.matteomalvezzi.OOP.strings;

public class GoodAroundTheBeginning {

    public static boolean goodAroundTheBeginning(String string){
        if(string.length() < 5) return false;
        if(string.startsWith("good", 1)) return true;
        return string.startsWith("good");
    }
}
