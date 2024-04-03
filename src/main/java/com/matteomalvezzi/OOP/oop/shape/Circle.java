package com.matteomalvezzi.OOP.oop.shape;

import java.awt.*;

public class Circle extends AbstractShape{

    Point center;

    double radius;

    public Circle(String id, String color, Point center, double radius) {
        super(color, id);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void move(Point p) {
        this.center.translate(p.x, p.y);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void resize(double d) {
        this.radius *= d;
    }
}
