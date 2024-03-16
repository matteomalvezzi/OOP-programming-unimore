package com.matteomalvezzi.OOP.strings;

import java.util.Scanner;

public class EqualIsNot {

    public static boolean equalIsNot(String string){

        String cp = new String(string);
        int is_counter= 0;

        //until there is also one is inner string continue loop
        while (cp.contains("is")){
            //each loop increment counter value and remove older appearances of "is"
            is_counter++;
            cp = cp.substring(cp.indexOf("is")+2);
        }

        cp = new String(string);
        int not_counter= 0;

        while (cp.contains("not")){
            not_counter++;
            cp = cp.substring(cp.indexOf("not")+2);
        }
        return not_counter == is_counter;
    }

}
