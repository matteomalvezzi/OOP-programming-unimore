package com.matteomalvezzi.OOP.generics;

public class PairSameType<T> {

    T first, second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public PairSameType(T first, T second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first.toString() +
                ", second=" + second.toString() +
                '}';
    }

    public void swap(){
        T tmp = first;
        first = second;
        second = tmp;
    }
}
