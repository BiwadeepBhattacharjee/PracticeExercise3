package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard cb;

    @Before
    public void setUp() throws Exception {
        cb = new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
        cb = null;
    }

    @Test
    public void testColouredBoxes() {


        String expected[][] = {{"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}};
        String actualValue[][] = cb.colouredBoxes();
        assertArrayEquals(expected, actualValue);
        assertNotNull(cb);

    }


    @Test
    public void testColouredBoxesFailure() {


        String expected1[][] = {{"BB", "BB", "BB", "BB", "BB", "BB", "BB", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}};
        String actualValue[][] = cb.colouredBoxes();
        assertNotEquals(expected1, actualValue);
        assertNotNull(cb);

    }
}