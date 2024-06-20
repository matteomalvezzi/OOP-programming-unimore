package com.matteomalvezzi.OOP.functional;

import com.matteomalvezzi.OOP.oop.phonebook.Person;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PhoneBook {

    final List<Person> people;

    public PhoneBook(List<Person> people) {
        this.people = people;
    }



    public Optional<Person> searchByLastname(String lastname){
        for (Person person : people) {
            if(person.getLastname().equals(lastname)) return Optional.of(person);
        }
        return Optional.empty();
    }

    public Optional<Person> searchByNameAndLastname(String name, String lastname) {
        for (Person person : people) {
            if(person.getLastname().equals(lastname) && person.getName().equals(name)) return Optional.of(person);
        }
        return Optional.empty();
    }

    public static class Person {
    String name;
    String lastname;
    String phone;

    public Person(String name, String lastname, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname) && Objects.equals(phone, person.phone);
        }
}
}
