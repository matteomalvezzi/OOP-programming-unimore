package com.matteomalvezzi.OOP.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates{

    //Remove manually duplicates
    public static List<Integer> removeDuplicatesVer2(List<Integer> list){

        List<Integer> new_list = new ArrayList<>(list);

        for (int i = 0; i < list.size(); i++) {
            int el = list.get(i);
            if(list.subList(i+1, list.size()).contains( el ) ) new_list.remove(el);
        }

        return new_list;
    }

    //Given that Set contain unique element, it is enough redeclare the List a Set and after recreate a List
    public static List<Integer> removeDuplicates(List<Integer> list){
        return new ArrayList<>(new HashSet<>(list));
    }
}
