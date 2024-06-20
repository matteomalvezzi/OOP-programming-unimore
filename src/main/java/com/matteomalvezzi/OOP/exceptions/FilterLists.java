package com.matteomalvezzi.OOP.exceptions;

import com.matteomalvezzi.OOP.exceptions.CheckString;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FilterLists {

    public static List<List<String>> filterLists(List<List<String>> lists){
        List<List<String>> returned_list = new ArrayList<>();

        for (List<String> list : lists) {
            try {
                for (String s : list) {
                    CheckString.checkString(s);
                }
                returned_list.add(list);
            }catch (ParseException ignored){

            }
        }
        return returned_list;
    }
}
