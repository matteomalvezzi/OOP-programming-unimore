package com.matteomalvezzi.OOP.exception;

import com.matteomalvezzi.OOP.exceptions.CheckLicencePlate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CheckLicencePlateTest {

    @Test
    void checkLicencePlate() {
        assertDoesNotThrow(() -> CheckLicencePlate.checkLicencePlate("AA958LV"));
        assertThrows(IllegalArgumentException.class, () -> CheckLicencePlate.checkLicencePlate("BO95889"));
        assertThrows(IllegalArgumentException.class, () -> CheckLicencePlate.checkLicencePlate("1295889"));
    }
}