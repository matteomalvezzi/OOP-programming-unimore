package com.matteomalvezzi.OOP.exception;

import com.matteomalvezzi.OOP.exceptions.ReadLineNoDelegation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class ReadLineNoDelegationTest {
    @Test
    void noDelegation() {
        assertNull(ReadLineNoDelegation.readLineNoDelegation("/tmp/missing"));
    }
}
