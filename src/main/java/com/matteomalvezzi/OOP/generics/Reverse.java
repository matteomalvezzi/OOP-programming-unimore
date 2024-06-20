package com.matteomalvezzi.OOP.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {

    public static <T> void reverseV2(List<T> list){
        int size = list.size();
        for (int i = 0; i < size/2; i++) {
            T tmp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, tmp);
        }
    }

    public static <T> void reverse(List<T> list){
        Collections.reverse(list);
    }

}
