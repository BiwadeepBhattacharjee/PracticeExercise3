package com.stackroute;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks sm;

    @org.junit.Before
    public void setUp() throws Exception {
        sm = new StudentMarks();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        sm = null;
    }

    @org.junit.Test
    public void check() {
        String expected = "true";
        int[] grades = {21, 35, 45, 60, 84};
        String actualValue = sm.checkGrade(5, grades);
        assertEquals(expected, actualValue);
        assertNotNull(sm);
    }

    @org.junit.Test
    public void checkFailure() {
        String expected = "false";
        int[] grades = {21, 35, 45, 60, 840};
        String actualValue = sm.checkGrade(5, grades);
        assertEquals(expected, actualValue);
        assertNotNull(sm);
    }
}