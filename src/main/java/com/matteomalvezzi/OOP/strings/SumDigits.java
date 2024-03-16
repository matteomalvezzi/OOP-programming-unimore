package com.matteomalvezzi.OOP.strings;

public class SumDigits {
    public static int sumDigits(String string){
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {

            char character = string.charAt(i);
            if(Character.isDigit(character)){

                sum+= Character.getNumericValue(character);
            }
        }
        return sum;
    }

}
