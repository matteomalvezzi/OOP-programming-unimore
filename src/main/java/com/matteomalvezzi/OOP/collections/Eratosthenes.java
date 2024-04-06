package com.matteomalvezzi.OOP.collections;

import java.util.HashSet;
import java.util.Set;

public class Eratosthenes {
    public static Set<Integer> eratosthenes(int n){

        Set<Integer> number = new HashSet<>();
        for (int i = 2; i <= n; i++) number.add(i);

        //We have to create new Set because we cannot modify number set inner cycle
        Set<Integer> prime = new HashSet<>(number);

        for (int i = 2; i < Math.sqrt(n); i++) {

            for (Integer el : number) {
                if(el!=i && el%i==0) prime.remove(el);
            }
        }
        return prime;
    }

}
