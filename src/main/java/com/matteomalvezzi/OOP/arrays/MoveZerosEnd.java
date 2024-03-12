package com.matteomalvezzi.OOP.arrays;

public class MoveZerosEnd {

    public static int[] moveZerosEnd(int[] v){
        int[] vv = new int[v.length];
        int j = 0;
        for (int v_el : v){
            if(v_el != 0) vv[j++] = v_el;
        }
        return vv;
    }
}
