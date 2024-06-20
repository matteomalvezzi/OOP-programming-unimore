package com.matteomalvezzi.OOP.exceptions;

import java.io.IOException;

public class RetryWrite {
    public static void main(String[] args) {
        try {
            writeWithTries(3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeWithTries(int maxTries) {
        int ok = 0;
        while (ok < maxTries){
            try {
                write("ok");
            } catch (IOException e) {
                ok++;
                if(ok == maxTries) throw new RuntimeException();
            }
        }
    }

    public static void write(String message) throws IOException {
        throw new IOException("Unable to send: " + message);
    }
}
