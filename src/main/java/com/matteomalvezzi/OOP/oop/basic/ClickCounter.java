package com.matteomalvezzi.OOP.oop.basic;

public class ClickCounter {

    int value;

    /**
     * gets current number of clicks
     *
     * @return current click value
     * */
    public int getValue() { return value; }

    /**
     * increment click value , do click
     * */
    public void click(){ value++;}

    /**
     * remove a click
     * */
    public void undo(){ if(value > 0) value--; }

    /**
     * reset number of click to 0 value
     * */
    public void reset(){ value = 0;}
}
