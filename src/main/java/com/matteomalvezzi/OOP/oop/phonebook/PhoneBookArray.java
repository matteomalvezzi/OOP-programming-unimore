package com.matteomalvezzi.OOP.oop.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements PhoneBook{
    static final int MAX_PERSONS = 256;

    final Person[] phoneBook;

    public PhoneBookArray() {
        phoneBook = new Person[MAX_PERSONS];
    }

    @Override
    public boolean addPerson(Person p){
        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phoneBook[i] != null && phoneBook[i].equals(p)) {
                return false;
            }
        }

        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phoneBook[i] == null) {
                phoneBook[i] = p;
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean removePerson(Person p){

        for (int c = 0; c < MAX_PERSONS; c++) {
            if(phoneBook[c] != null && phoneBook[c].equals(p) ){
                phoneBook[c] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname){

        int find_counter = 0;

        Person[] p = new Person[MAX_PERSONS];

        for (Person person : this.phoneBook) {
            if(person != null && person.lastname.equals(lastname)) {
                p[find_counter] = person;
                find_counter++;
            }
        }
        return Arrays.copyOf(p, find_counter);
    }


    @Override
    public Person[] searchByNameAndLastname(String name, String last_name){

        int find_counter = 0;

        Person[] p = new Person[MAX_PERSONS];

        for (Person person : this.phoneBook) {
            if(person != null && person.name.equals(name) && person.lastname.equals(last_name)) {
                p[find_counter] = person;
                find_counter++;
            }
        }
        return Arrays.copyOf(p, find_counter);

    }

}
