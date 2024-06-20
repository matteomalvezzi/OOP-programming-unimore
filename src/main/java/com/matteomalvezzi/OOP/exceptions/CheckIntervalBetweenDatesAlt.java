package com.matteomalvezzi.OOP.exceptions;

import java.time.LocalDate;

public class CheckIntervalBetweenDatesAlt {

    public static boolean checkIntervalBetweenDatesAlt(String begin, String end){

        try{
            LocalDate begin_date = LocalDate.parse(begin);
            LocalDate end_date = LocalDate.parse(end);
            return begin_date.isBefore(end_date);
        }catch (Exception e){
            return false;
        }
    }
}
