package com.matteomalvezzi.OOP.oop.basic;

public class Letter {

    String from;
    String to;
    StringBuilder lines;

    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
        lines = new StringBuilder();
    }

    public void addLine(String line){ lines.append(line).append("\n"); }

    public String getText() {
        return "Dear " + to + ":\n\n" + lines + "\n" + "Best regards,\n\n" + from;
    }

}
