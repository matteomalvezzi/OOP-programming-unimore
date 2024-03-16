package com.matteomalvezzi.OOP.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DuplicateCharsTest {
    @Test
    public void duplicateChars() {
        assertArrayEquals(new char[]{'e', 'l', 'w'}, DuplicateChars.duplicateChars("whistleblower"));
        assertArrayEquals(new char[]{'s'}, DuplicateChars.duplicateChars("ss"));
        assertArrayEquals(new char[]{}, DuplicateChars.duplicateChars("s"));
        assertArrayEquals(new char[]{}, DuplicateChars.duplicateChars(""));
    }

    @Test
    public void duplicateCharsVer2(){
        assertArrayEquals(new char[]{'e', 'l', 'w'}, DuplicateChars.duplicateCharsVer2("whistleblower"));
        assertArrayEquals(new char[]{'s'}, DuplicateChars.duplicateCharsVer2("ss"));
        assertArrayEquals(new char[]{}, DuplicateChars.duplicateCharsVer2("s"));
        assertArrayEquals(new char[]{}, DuplicateChars.duplicateCharsVer2(""));
    }
}
