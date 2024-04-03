package com.matteomalvezzi.OOP.oop.shape;

import java.awt.*;

public abstract class AbstractShape implements Computable, Movable, Resizable{

    String color;
    String id;

    public AbstractShape(String color, String id) {
        setColor(color);
        this.id = id;
    }

    /** --- Setter --- */
    public void setColor(String color) {
        //matches method get a regular expression
        /* -- regular expression rules
        *   ^# check if the line starts with hashtag
        *   () define a group that has to respect the pattern which contains
        *   [a-fA-F0-9]{6} the pattern can include a-f A-F 0-9 and there must be 6 character
        *   $ the string has to finish, there can be no others characters
        * */

        if(color.matches("^#([a-fA-F0-9]{6})$")){
            this.color = color;
        }else throw new IllegalArgumentException("Invalid color parameter");

    }

    public void setId(String id) {
        this.id = id;
    }

    /** --- Getter --- */
    public String getColor() {
        return color;
    }

    public String getId() {
        return id;
    }




    //It is not necessary to rewrite methods from interface like abstracts, if I don't provide an implementation for the methods of the interface, it’s similar to declaring those methods as abstract.

    //In alternative, we can implements like abstract
    public abstract void move(Point p);

}
