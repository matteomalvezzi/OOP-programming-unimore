package com.matteomalvezzi.OOP.oop.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook{

    static final int MAX_PERSONS = 256;

    final ArrayList<Person> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public boolean addPerson(Person person) {
        if(this.phoneBook.contains(person)) return false;

        if(this.phoneBook.size() == MAX_PERSONS) return false;

        if(person == null) return false;

        this.phoneBook.add(person);
        return true;
    }

    @Override
    public boolean removePerson(Person person) {
        if(person == null || !this.phoneBook.contains(person)) return false;

        this.phoneBook.remove(person);
        return true;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> found_person = new ArrayList<>();

        for (Person person : this.phoneBook) {
            if( person != null  && lastname.equals(person.lastname) ) found_person.add(person);
        }
        //toArray method not require an array with size of array List, it uses new Person[0] only to recognise type of array
        return found_person.toArray(new Person[0]);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> found_person = new ArrayList<>();

        for (Person person : this.phoneBook) {
            if( person != null  &&
                name.equals(person.name) &&
                lastname.equals(person.lastname) ) found_person.add(person);
        }
        //toArray method not require an array with size of array List, it uses new Person[0] only to recognise type of array
        return found_person.toArray(new Person[0]);
    }
}
