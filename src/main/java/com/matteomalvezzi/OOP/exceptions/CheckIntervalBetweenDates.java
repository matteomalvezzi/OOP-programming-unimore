package com.matteomalvezzi.OOP.exceptions;

import java.time.LocalDate;

public class CheckIntervalBetweenDates {

    public static boolean checkIntervalBetweenDates(String begin, String end){
        LocalDate begin_date = LocalDate.parse(begin);
        LocalDate end_date = LocalDate.parse(end);
        return begin_date.isBefore(end_date);

    }

}
