package com.matteomalvezzi.OOP.oop.basic;

import java.util.Arrays;

public class EnhancedResizableArray {

    public static final int DEFAULT_CAPACITY = 4;
    int[] array;

    public EnhancedResizableArray() {
        this.array = new int[DEFAULT_CAPACITY];
    }

    public int get(int index){
        if(index < array.length && index >= 0) return array[index];
        else throw new IndexOutOfBoundsException();
    }

    public void set(int index, int value) //throws Exception
    {
        if(index >= array.length){
            int[] new_array = new int[index * 2];
            System.arraycopy(array, 0, new_array, 0, array.length);

            array = new_array;
        }//else if(index < 0) throw new Exception("negative index"); --- commented to run tests without add exception handle

        array[index] = value;
    }

    public boolean contains(int value){
        for (int el : array) {
            if(el == value) return true;
        }
        return false;
    }

    public void fill(int value){
        Arrays.fill(array, value);
    }


    public int[] toArray() {
        return array.clone();
    }

    public int length() {
        return array.length;
    }
}
