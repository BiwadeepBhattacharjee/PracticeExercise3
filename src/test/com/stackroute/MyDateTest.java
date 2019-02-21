package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;


public class MyDateTest {
    MyDate md;

    @Before
    public void setUp() {
        md = new MyDate();
    }

    @After
    public void tearDown() {
        md = null;
    }

    @Test
    public void testStartDate() {
        boolean expectedValue = true;
        boolean actualValue = md.startDate();
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void testEndDate() {
        boolean expectedValue1 = true;
        boolean actualValue1 = md.endDate();
        assertEquals(expectedValue1, actualValue1);
        assertNotNull(actualValue1);
    }


}