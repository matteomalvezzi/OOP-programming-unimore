package com.matteomalvezzi.OOP.arrays;

public class CanBalance {

    public static boolean canBalance(int[] v){
        for (int i = 0; i < v.length; i++) {

            int f_sum = 0;
            for (int j = 0; j < i; j++) f_sum += v[j];
            int l_sum = 0;
            for (int j = i; j < v.length; j++) l_sum += v[j];
            if (l_sum == f_sum) return true;
        }
        return false;
    }

}
