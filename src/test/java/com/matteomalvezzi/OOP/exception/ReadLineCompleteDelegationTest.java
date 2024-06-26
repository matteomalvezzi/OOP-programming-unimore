package com.matteomalvezzi.OOP.exception;

import com.matteomalvezzi.OOP.exceptions.ReadLineCompleteDelegation;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReadLineCompleteDelegationTest {
    @Test
    void readLineCompleteDelegationTest() {
        assertThrows(IOException.class, () -> ReadLineCompleteDelegation.readLineCompleteDelegation("/tmp/missing"));
    }
}
