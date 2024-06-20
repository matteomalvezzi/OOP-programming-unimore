package com.matteomalvezzi.OOP.functional;

import java.util.List;

public class NoYYZ {

    public static List<String> noYYZ(List<String> strings){
        return strings.stream()
                .map( s -> s+"y")
                .filter( s -> !s.contains("yy"))
                .peek( s -> {
                    if (s.startsWith("z")) System.out.println(s);
                })
                .toList();
    }
}
