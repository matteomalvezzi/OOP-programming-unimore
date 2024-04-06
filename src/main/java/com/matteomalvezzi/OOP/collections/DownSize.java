package com.matteomalvezzi.OOP.collections;

import java.util.List;

public class DownSize {

    public static void downsize(List<String> list, int n){

        int c = 0;
        for (int i = 0; i < list.size(); i++) {
            c++;
            if(c == n) {
                list.remove(i);
                i--; //if I remove element from a list inner loop I have to reset counter
                c =0;
            }
        }
    }
}
