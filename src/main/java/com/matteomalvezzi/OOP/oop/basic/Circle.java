package com.matteomalvezzi.OOP.oop.basic;

import java.awt.*;

public class Circle {

    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPerimeter() { return radius*2*Math.PI; }

    public double getArea() { return Math.pow(radius, 2) * Math.PI; }

    public boolean contains(Point p){
        return Math.hypot(p.x - center.x, p.y - center.y) < radius;
    }

    public void translate(int dx, int dy) {
        center.translate(dx, dy);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
