package com.matteomalvezzi.OOP.oop.library;


import java.time.LocalDate;
import java.util.ArrayList;

public class Library {

    ArrayList<Rent> rents;

    public Library() {
        rents = new ArrayList<>();
    }

    public boolean addRent(Rent r){
        for (Rent rent : rents) {
            if(rent.equals(r)) return false;
        }
        rents.add(r);
        return true;
    }

    public boolean removeRent(Rent r){
        for (Rent rent : rents) {
            if(rent.equals(r)) return rents.remove(r);
        }
        return false;
    }

    public ArrayList<Rent> getExpired(LocalDate date){
        ArrayList<Rent> rentExpired = new ArrayList<>();
        for (Rent rent : rents) {
            if(rent.isExpired(date)) rentExpired.add(rent);
        }
        return rentExpired;
    }
}
