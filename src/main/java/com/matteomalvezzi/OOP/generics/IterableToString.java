package com.matteomalvezzi.OOP.generics;

public class IterableToString {

    public static <E> String iterableToString(Iterable<E> src){
        StringBuilder st = new StringBuilder();
        for (E e : src) {
            st.append(e).append(", ");
        }
        return st.toString();
    }
}
