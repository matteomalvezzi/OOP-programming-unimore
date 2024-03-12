package com.matteomalvezzi.OOP.arrays;

public class BubbleSort {

    public static void bubbleSort(int[] v){
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length-1; j++) {
                if(v[j] > v[j+1]){
                    int tmp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = tmp;
                }
            }
        }
    }
    public static int[] bubbleSortCopy(int[] v){
        int[] vv = v.clone();
        bubbleSort(vv);
        return vv;
    }
}
