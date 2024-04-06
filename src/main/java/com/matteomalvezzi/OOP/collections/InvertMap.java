package com.matteomalvezzi.OOP.collections;

import java.util.HashMap;
import java.util.Map;

public class InvertMap {

    public static Map<String, Integer> invertMap(Map<Integer, String> src){
        Map<String, Integer> inverted= new HashMap<>();

        for(Map.Entry<Integer, String> entry : src.entrySet()){

            if(inverted.get(entry.getValue()) == null){
                inverted.put(entry.getValue(), entry.getKey());
            }

            /* -- or we can use lambda function
                inverted.computeIfAbsent(entry.getValue(), k -> entry.getKey());
             */

            /* -- or we can use containsKey method
                if( !inverted.containsKey(entry.getValue()) ){
                    inverted.put(entry.getValue(), entry.getKey());
                }
             */

        }
        return inverted;
    }

}
