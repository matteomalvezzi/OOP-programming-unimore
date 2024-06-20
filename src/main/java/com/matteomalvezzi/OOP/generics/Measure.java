package com.matteomalvezzi.OOP.generics;

public class Measure {

    public interface Measurer<T> {
        double measure(T t);
    }

    public static <T> T max(T[] array, Measurer<T> measurer) {
        T current_max = array[0];
        for (T t : array) {
            if(measurer.measure(t) > measurer.measure(current_max)) current_max = t;
        }
        return current_max;
    }

    public static <T> T min(T[] array, Measurer<T> measurer) {
        T current_max = array[0];
        for (T t : array) {
            if(measurer.measure(t) < measurer.measure(current_max)) current_max = t;
        }
        return current_max;
    }

}
