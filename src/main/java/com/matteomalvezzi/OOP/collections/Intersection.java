package com.matteomalvezzi.OOP.collections;

import java.util.Set;
import java.util.TreeSet;

public class Intersection {
    /**
     What are the characteristics of a set?
     1. Uniqueness
     2. No Indexing

     Implementation Classes:

     HashSet: It uses a hash table to store elements.
     LinkedHashSet: It maintains the insertion order of elements while also implementing the Set interface.
     TreeSet: It stores elements in a sorted tree structure

     Common Operations: add() remove() contains() size()
     * */
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second){
        Set<Integer> inter = new TreeSet<>();

        for (Integer i : first) {
            for (Integer j : second) {
                if(i.equals(j)) inter.add(i);
            }
        }
        return inter;
    }
}
