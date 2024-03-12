package com.matteomalvezzi.OOP.arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {

    public static double[] fillArray(int size, double value, boolean addNoise){
        double[] array= new double[size];

        if(addNoise){
            double more_5_percent = value +(value/100)*5;
            double less_5_percent = value -(value/100)*5;
            for (int i = 0; i < array.length; i++) array[i] = RandomGenerator.getDefault().nextDouble(less_5_percent, more_5_percent);
        }else{
            Arrays.fill(array, value);
        }
        return array;
    }
}
