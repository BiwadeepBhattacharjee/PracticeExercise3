package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfMatricesTest {
    AdditionOfMatrices aom;

    @Before
    public void setUp() throws Exception {
        aom = new AdditionOfMatrices();
    }

    @After
    public void tearDown() throws Exception {
        aom = null;
    }

    @Test
    public void sumOfMatrices() {

        int expected[][] = {{10, 10}, {10, 10}, {10, 10}};
        int array1[][] = {{1, 2}, {3, 4}, {5, 6}};
        int array2[][] = {{9, 8}, {7, 6}, {5, 4}};

        int actualValue[][] = aom.sumOfMatrices(3, 2, array1, array2);
        assertArrayEquals(expected, actualValue);
        assertNotNull(aom);
    }

    @Test
    public void sumOfMatricesFailure() {

        int expected[][] = {{11, 11, 11}, {11, 11, 11}};
        int array1[][] = {{1, 2}, {3, 4}, {5, 6}};
        int array2[][] = {{9, 8}, {7, 6}, {5, 4}};

        int actualValue[][] = aom.sumOfMatrices(3, 2, array1, array2);
        assertNotEquals(expected, actualValue);
        assertNotNull(aom);
    }
}