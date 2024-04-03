package com.matteomalvezzi.OOP.oop.reverse;

public class TestReverser {
    public static void main(String[] args) {
        ReverserFast rf = new ReverserFast();
        ReverserSlow rs = new ReverserSlow();

        System.out.println(rf.reverse("Hello World!"));

        System.out.println(rs.reverse("Ciao Mondo"));
    }
}
