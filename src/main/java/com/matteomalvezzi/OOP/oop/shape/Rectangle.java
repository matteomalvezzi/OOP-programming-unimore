package com.matteomalvezzi.OOP.oop.shape;

import java.awt.*;

public class Rectangle extends AbstractShape{


    Point bottomRight;
    Point upperLeft;

    public Rectangle(String id, String color, Point upperLeft, Point bottomRight) {
        super(color, id);
        this.bottomRight = bottomRight;
        this.upperLeft = upperLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    @Override
    public void move(Point p) {
        upperLeft.translate(p.x, p.y);
        bottomRight.translate(p.x, p.y);
    }

    @Override
    public double getArea() {
        double width = Math.abs(upperLeft.x - bottomRight.x);
        double height = Math.abs(upperLeft.y - bottomRight.y);
        return width * height;
    }

    @Override
    public double getPerimeter() {
        double width = Math.abs(upperLeft.x - bottomRight.x);
        double height = Math.abs(upperLeft.y - bottomRight.y);
        return (width*2) + (height*2);
    }

    @Override
    public void resize(double d) {
        double width = Math.abs(upperLeft.x - bottomRight.x);
        double height = Math.abs(upperLeft.y - bottomRight.y);
        bottomRight.x =  (int) ( upperLeft.x + (width*d));
        bottomRight.y += (int) ( upperLeft.y - (height*d));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "bottomRight=" + bottomRight +
                ", upperLeft=" + upperLeft +
                ", color='" + color + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
