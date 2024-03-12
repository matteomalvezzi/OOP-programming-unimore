package com.matteomalvezzi.OOP.arrays;

public class CopyArray {

    public static double[] copyArray(double[] v){
        double[] array = new double[v.length];
        System.arraycopy(v, 0, array, 0, v.length);
        return array;
    }
}
