package com.matteomalvezzi.OOP.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MorseCode {

    public static Map<Character, String> generateMorseCodeMap() {
        Map<Character, String> morseCodeMap = new HashMap<>();
        morseCodeMap.put('a', "._");
        morseCodeMap.put('b', "_...");
        morseCodeMap.put('c', "_._.");
        morseCodeMap.put('d', "_..");
        morseCodeMap.put('e', ".");
        morseCodeMap.put('f', ".._.");
        morseCodeMap.put('g', "__.");
        morseCodeMap.put('h', "....");
        morseCodeMap.put('i', "..");
        morseCodeMap.put('j', ".___");
        morseCodeMap.put('k', "_._");
        morseCodeMap.put('l', "._..");
        morseCodeMap.put('m', "__");
        morseCodeMap.put('n', "_.");
        morseCodeMap.put('o', "___");
        morseCodeMap.put('p', ".__.");
        morseCodeMap.put('q', "__._");
        morseCodeMap.put('r', "._.");
        morseCodeMap.put('s', "...");
        morseCodeMap.put('t', "_");
        morseCodeMap.put('u', ".._");
        morseCodeMap.put('v', "..._");
        morseCodeMap.put('w', ".__");
        morseCodeMap.put('x', "_.._");
        morseCodeMap.put('y', "_.__");
        morseCodeMap.put('z', "__..");
        return morseCodeMap;
    }

    public static void checkString(Set<Character> alphabet, String string) {
        for (char c : string.toLowerCase().toCharArray()) {
            if (!alphabet.contains(c)) {
                throw new IllegalArgumentException("String NOT VALID");
            }
        }
    }
    public static String morseCode(String string){
        Map<Character, String> morseMap = generateMorseCodeMap();

        checkString(morseMap.keySet(), string);

        StringBuilder sb = new StringBuilder();
        char[] c = string.toLowerCase().toCharArray();
        for (int i = 0; i < c.length; i++) {
            sb.append(morseMap.get(c[i]));
            if(i!=c.length-1) sb.append(" ");
        }
        return sb.toString();
    }
}
