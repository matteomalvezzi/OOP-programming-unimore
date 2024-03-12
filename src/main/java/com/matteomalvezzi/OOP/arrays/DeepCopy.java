package com.matteomalvezzi.OOP.arrays;

import java.util.Arrays;

public class DeepCopy {

    /*
    * Deep Copy native algorithm
    * */
    public static int[][] nativeDeepCopy(int[][] original){

        int[][] copy = new int[original.length][];

        for (int i = 0; i < original.length; i++) {
            copy[i] = new int[original[i].length];
            for (int j = 0; j < original[i].length; j++) {
                copy[i][j] = original[i][j];
            }
        }
        return copy;
    }

    /*
     * Deep Copy with java methods (provided by System class)
     * */
    public static int[][] deepCopy(int[][] original){

        int[][] copy = new int[original.length][];

        for (int i = 0; i < original.length; i++) {
            copy[i] = new int[original[i].length];
            System.arraycopy(original[i], 0, copy[i], 0, original[i].length);
        }
        return copy;
    }

    /*
     * Deep Copy with java methods (provided by Arrays class)
     * */
    public static int[][] deepCopyArray(int[][] original){

        int[][] copy = new int[original.length][];

        for (int i = 0; i < original.length; i++) {
            copy[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return copy;
    }
}
