package com.matteomalvezzi.OOP.oop.library;

import java.util.Objects;

public abstract class Item {

    String title;
    int year;

    public Item(String title, int year) {
        this.title = title;
        this.year = year;
    }
    // ---- getter ----
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    // ---- setter ----

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return year == item.year && Objects.equals(title, item.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year);
    }
}
