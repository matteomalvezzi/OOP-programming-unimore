package com.matteomalvezzi.OOP.generics;

import java.util.List;

public class Append {
    public static <T> void append(List<T> dst, List<T> src){
        for (T t : src) {
            dst.add(t);
        }
    }
}
