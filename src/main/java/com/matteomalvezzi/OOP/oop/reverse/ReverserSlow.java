package com.matteomalvezzi.OOP.oop.reverse;

import java.util.Arrays;

public class ReverserSlow implements Reverser{

    @Override
    public String reverse(String s) {
        char[] c = s.toCharArray();
        char[] rc = new char[c.length];
        int i = c.length-1;
        for (char character : c) {
            rc[i] = character;
            i--;
        }
        return String.valueOf(rc);
    }
}
