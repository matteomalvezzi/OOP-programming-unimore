package com.matteomalvezzi.OOP.arrays;

import java.util.ArrayList;

public class Splitter {

    public static int[] splitter(int input){

        ArrayList<Integer> integerArrayList= new ArrayList<>();

        while(input!=0){
            integerArrayList.add(input%10);
            input /= 10;
        }
        int[] output = new int[integerArrayList.size()];
        int j = integerArrayList.size()-1;
        for (int i = 0; i < integerArrayList.size(); i++){
            output[i] = integerArrayList.get(j);
            j--;
        }
        return output;
    }

    public static int[] splitter_ver2(int input){
        String s = String.valueOf(input);
        int[] output = new int[s.length()];

        for (int i = 0; i < s.length(); i++) output[i] = Character.getNumericValue(s.charAt(i));
        return output;
    }
}
