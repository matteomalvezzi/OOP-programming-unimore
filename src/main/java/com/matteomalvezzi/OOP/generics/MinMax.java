package com.matteomalvezzi.OOP.generics;

import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static <T> T max(List<T> list, Comparator<? super T> cmp){
        T current_max = list.getFirst();
        for (T t : list) {
            if(cmp.compare(t, current_max) > 0) current_max = t;
        }
        return current_max;
    }
    public static <T> T min(List<T> list, Comparator<? super T> cmp){
        T current_min = list.getFirst();
        for (T t : list) {
            if(cmp.compare(t, current_min) < 0) current_min = t;
        }
        return current_min;
    }
}
