package com.matteomalvezzi.OOP.strings;

import java.util.Scanner;

public class CountYZ {
    public static int countYZ(String string){
        Scanner s = new Scanner(string);
        int counter = 0;
        while (s.hasNext()){

            String word = s.next().toLowerCase();
            if(word.endsWith("y") || word.endsWith("z")) counter++;
        }
        return counter;
    }

    public static int countYZVer2(String string){
        Scanner s = new Scanner(string);
        int counter = 0;
        while (s.hasNext()){

            String word = s.next().toLowerCase();
            //Get last character manually
            char last_character= word.charAt(word.length()-1);

            if(last_character == 'y' || last_character == 'z') counter++;
        }
        return counter;
    }


}
