package com.matteomalvezzi.OOP.arrays;

public class MatchUp {

    public static int matchUp(int[] v1, int[] v2){
        int counter = 0;
        for (int i = 0; i < v1.length; i++) {
            int difference = Math.abs( v1[i] - v2[i] );

            if(difference <= 2 && v1[i] != v2[i]) counter++;
        }
        return counter;
    }
}
