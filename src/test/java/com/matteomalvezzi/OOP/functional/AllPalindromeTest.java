package com.matteomalvezzi.OOP.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AllPalindromeTest {
    @Test
    void allPalindrome() {
        assertTrue(AllPalindrome.allPalindrome(List.of("kayak", "deed", "noon")));
        assertFalse(AllPalindrome.allPalindrome(List.of("kayak", "hello")));
        assertFalse(AllPalindrome.allPalindrome(List.of("hello", "world")));
    }

    @Test
    void allPalindromeVer2() {
        assertTrue(AllPalindromeVer2.allPalindrome(List.of("kayak", "deed", "noon")));
        assertFalse(AllPalindromeVer2.allPalindrome(List.of("kayak", "hello")));
        assertFalse(AllPalindromeVer2.allPalindrome(List.of("hello", "world")));
    }
}