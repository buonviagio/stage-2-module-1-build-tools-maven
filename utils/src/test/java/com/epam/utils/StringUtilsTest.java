package com.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        String s1 = "65", s2 = "-12", s3 = "F", s4 = "54d";
        assertTrue(StringUtils.isPositiveNumber(s1));
        assertFalse(StringUtils.isPositiveNumber(s2));
        assertFalse(StringUtils.isPositiveNumber(s3));
        assertTrue(StringUtils.isPositiveNumber(s4));
    }
}