package com.matteomalvezzi.OOP.oop.library;

import java.time.LocalDate;
import java.util.Objects;

public class Rent {

    LocalDate begin;
    LocalDate end;
    Item item;
    Person person;

    public Rent(Item item, Person person, LocalDate begin, LocalDate end) {
        this.begin = begin;
        this.end = end;
        this.item = item;
        this.person = person;
    }

    // ---- getter ----
    public LocalDate getBegin() {
        return begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public Item getItem() {
        return item;
    }

    public Person getPerson() {
        return person;
    }

    // ---- setter ----
    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public boolean isExpired(LocalDate now){ return end.isBefore(now); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rent rent = (Rent) o;
        return Objects.equals(begin, rent.begin) && Objects.equals(end, rent.end) && Objects.equals(item, rent.item) && Objects.equals(person, rent.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(begin, end, item, person);
    }

    @Override
    public String toString() {
        return "Rent{" +
                "begin=" + begin +
                ", end=" + end +
                ", item=" + item +
                ", person=" + person +
                '}';
    }
}
