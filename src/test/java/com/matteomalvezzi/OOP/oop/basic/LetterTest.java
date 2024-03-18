package com.matteomalvezzi.OOP.oop.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LetterTest {

    @Test
    void getText() {
        Letter letter = new Letter("me", "you");
        letter.addLine("Hello");
        letter.addLine("World!");
        String dst = """
                Dear you:

                Hello
                World!
                
                Best regards,
                
                me""";
        assertEquals(dst, letter.getText());
    }
}