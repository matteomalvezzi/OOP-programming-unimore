package com.matteomalvezzi.OOP.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountOccurrencesYZTest {
    @Test
    void countYZ() {
        assertEquals(2, CountYZ.countYZ("fez day"));
        assertEquals(2, CountYZ.countYZ("day fez"));
        assertEquals(2, CountYZ.countYZ("day fyyyz"));
        assertEquals(2, CountYZ.countYZ("daY fyyYZ"));
    }

    @Test
    void countYZVer2() {
        assertEquals(2, CountYZ.countYZVer2("fez day"));
        assertEquals(2, CountYZ.countYZVer2("day fez"));
        assertEquals(2, CountYZ.countYZVer2("day fyyyz"));
        assertEquals(2, CountYZ.countYZVer2("daY fyyYZ"));
    }
}