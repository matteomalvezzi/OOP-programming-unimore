package com.matteomalvezzi.OOP.exceptions;

import java.io.*;

public class ReadLinePartialDelegation {

    public static String readLinePartialDelegation(String filename){
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
