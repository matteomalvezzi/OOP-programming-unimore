package com.matteomalvezzi.OOP.oop.library;

import java.util.Objects;

public class Person {

    String id;
    String lastname;
    String name;

    public Person(String id, String lastname, String name) {
        this.id = id;
        this.lastname = lastname;
        this.name = name;
    }

    // ---- getter ----
    public String getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    // ---- setter ----
    public void setId(String id) {
        this.id = id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(lastname, person.lastname) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastname, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
