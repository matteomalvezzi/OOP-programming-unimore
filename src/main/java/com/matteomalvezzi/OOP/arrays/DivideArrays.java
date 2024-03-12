package com.matteomalvezzi.OOP.arrays;

import java.util.Arrays;

public class DivideArrays {

    public static double[] divideArrays(double[] v1, double[] v2){
        for (int i = 0; i < v1.length; i++) v1[i] = v1[i] / v2[i];
        return v1;
    }
}
