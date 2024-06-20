package com.matteomalvezzi.OOP.exception;

import com.matteomalvezzi.OOP.exceptions.RetryWrite;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class RetryWriteTest {

    @Test
    void writeWithTries() {
        assertThrows(RuntimeException.class, () -> RetryWrite.writeWithTries(3));
    }
}