package com.matteomalvezzi.OOP.collections;

import java.util.*;

public class WordFrequencySorted {

    public static Map<String, Integer> mostFrequentVer1(Map<String, Integer> map, int limit){
        //get entry set and after create a list
        List< Map.Entry<String, Integer> > entries = new ArrayList<>(map.entrySet().stream().toList());

        Map<String, Integer> most_frequent = new HashMap<>();

        entries.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o2.getValue(), o1.getValue());
            }
        });

        for (int i = 0; i < limit; i++) {
            Map.Entry<String, Integer> entry = entries.get(i);
            most_frequent.put(entry.getKey(), entry.getValue());
        }
        return most_frequent;
    }


    public static Map<String, Integer> lessFrequentVer1(Map<String, Integer> map, int limit){
        //get entry set and after create a list
        List< Map.Entry<String, Integer> > entries = new ArrayList<>(map.entrySet().stream().toList());

        Map<String, Integer> most_frequent = new HashMap<>();

        entries.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                // Reversing the comparison logic
                return Integer.compare(o1.getValue(), o2.getValue());
            }
        });

        for (int i = 0; i < limit; i++) {
            Map.Entry<String, Integer> entry = entries.get(i);
            most_frequent.put(entry.getKey(), entry.getValue());
        }
        return most_frequent;
    }




    //we can save code create a single method and then pass it the Comparator as Parameter
    public static Map<String, Integer> mostFrequent(Map<String, Integer> map, int limit){
        return Frequent(map, limit, (o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));
    }

    public static Map<String, Integer> lessFrequent(Map<String, Integer> map, int limit){
        return Frequent(map, limit, (o1, o2) -> Integer.compare(o1.getValue(), o2.getValue()));
    }

    public static Map<String, Integer> Frequent(Map<String, Integer> map, int limit, Comparator<Map.Entry<String, Integer>> comparator){
        //get entry set and after create a list
        List< Map.Entry<String, Integer> > entries = new ArrayList<>(map.entrySet().stream().toList());

        Map<String, Integer> most_frequent = new HashMap<>();

        entries.sort(comparator);

        for (int i = 0; i < limit; i++) {
            Map.Entry<String, Integer> entry = entries.get(i);
            most_frequent.put(entry.getKey(), entry.getValue());
        }
        return most_frequent;
    }
}
