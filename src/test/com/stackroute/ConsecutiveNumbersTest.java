package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers consecutiveNumbers;

    @Before
    public void setUp() throws Exception {
        consecutiveNumbers = new ConsecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
        consecutiveNumbers = null;
    }

    @Test
    public void testCheckConsecutiveSuccess1() {
        assertEquals(false, consecutiveNumbers.checkConsecutive("98,96,95,94,93,91,89"));
        assertNotNull(consecutiveNumbers.checkConsecutive("98,96,95,94,93,91,89"));
    }

    @Test
    public void testCheckConsecutiveSuccess2() {
        assertEquals(false, consecutiveNumbers.checkConsecutive("97,96,92,91,97,98,99"));
        assertNotNull(consecutiveNumbers.checkConsecutive("97,96,92,91,97,98,99"));
    }

    @Test
    public void testCheckConsecutiveFailure() {
        assertNotEquals(true, consecutiveNumbers.checkConsecutive("98,96,95,94,93,91,89"));
        assertNotNull(consecutiveNumbers.checkConsecutive("98,96,95,94,93,91,89"));
    }
}