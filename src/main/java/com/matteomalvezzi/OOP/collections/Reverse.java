package com.matteomalvezzi.OOP.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Reverse {

    public static List<String> reverse(List<String> sentence){

        Deque<String> deque = new ArrayDeque<>();
        for (String s : sentence) {
            deque.offerFirst(s);
        }
        return deque.stream().toList();
    }
}
