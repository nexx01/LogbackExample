package com.example.janinoevaluatorexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegexTest {
    private static final String testStr = "[INFO] Ending................................................................";

    @Test
    void name() {
        assertTrue(testStr.matches(""));
    }
    @Test
    void name1() {
        assertTrue(testStr.matches("[/w]"));
    }

    @Test
    void name2() {
        assertTrue("E".matches("."));
    }

    @Test
    void name3() {
        assertTrue("E".matches("[AE]"));
    }
    @Test
    void name4() {
        assertTrue("EA".matches("[AE]*"));
    }

    @Test
    void name5() {
        assertTrue("Ending".matches("[A-Za-z]*"));
    }

    @Test
    void name6() {
        assertTrue(testStr.matches("[A-Za-z]*[.]*"));
    }

    @Test
    void name7() {
        assertTrue(testStr.matches("[INFO]/s[A-Za-z]*[.]*"));
    }

    @Test
    void name8() {
        assertTrue("[INFO]".matches("\\[INFO\\]"));
    }

    @Test
    void name9() {
        assertTrue("[INFO] ".matches("\\[INFO\\]\s"));
    }

    @Test
    void nam10() {
        assertTrue(testStr.matches("\\[INFO\\]\s[A-Za-z]*[.]*"));
    }
}
