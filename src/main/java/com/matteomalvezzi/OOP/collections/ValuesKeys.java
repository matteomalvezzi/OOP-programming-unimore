package com.matteomalvezzi.OOP.collections;

import java.util.Map;

public class ValuesKeys {

    public static boolean valuesKeys(Map<String, String> map){
        for(String value: map.values()){
            for(String key: map.keySet()){
                if(key.equals(value)) return true;
            }
        }
        return false;
    }
}
