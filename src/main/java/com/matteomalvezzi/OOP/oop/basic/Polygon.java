package com.matteomalvezzi.OOP.oop.basic;


import java.awt.Point;
import java.util.Arrays;

public class Polygon {
    final Point[] vertices;

    public Polygon(Point[] vertices) {
        this.vertices = vertices;
    }

    public int getVerticesCount(){ return vertices.length;}


    public double getPerimeter(){
        double p = 0;
        int n = 0;

        for (int i = 0; i < vertices.length; i++) {
            if(i == vertices.length-1) n = 0;
            else n = i+1;

            int x = vertices[i].x;
            int x1 = vertices[n].x;
            int y = vertices[i].y;
            int y1 = vertices[n].y;

            p += Math.sqrt(Math.pow(x1-x,2)+Math.pow(y1-y,2));
        }
        return p;
    }

    public double getArea(){
        double a = 0;
        int n = 0;

        for (int i = 0; i < vertices.length-1; i++) {

            //replaceable with int n = (i + 1) % vertices.length;
            if(i == vertices.length-1) n = 0;
            else n = i+1;

            //these declarations are not necessary, but we write it anyway to emphasize the math formula
            int x = vertices[i].x;
            int x1 = vertices[n].x;
            int y = vertices[i].y;
            int y1 = vertices[n].y;

            a += (x1*y) - (y1*x);
        }
        return Math.abs(a/2);
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                '}';
    }
}

