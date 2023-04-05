package com.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        String s1 = "65", s2 = "54d", s3 = "88";
        assertTrue(StringUtils.isPositiveNumber(s1));
        assertTrue(StringUtils.isPositiveNumber(s2));
        assertTrue(StringUtils.isPositiveNumber(s3));
    }
}