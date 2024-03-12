package com.matteomalvezzi.OOP.arrays;

import java.util.Arrays;

public class SearchArray {

    public static boolean containsBruteForce(String[] strings, String searched){
        for (String s : strings) {
            if(s.equals(searched)) return true;
        }
        return false;
    }
    public static boolean containsBinary(String[] strings, String searched){
        String[] cp = Arrays.copyOf(strings, strings.length);
        Arrays.sort(cp);
        return Arrays.binarySearch(cp, searched) >= 0;
    }

}
