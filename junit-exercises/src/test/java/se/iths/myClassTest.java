package se.iths;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class myClassTest {
    @Test
    public void returnsTheSmallestOfTheDoubles() {
        double a = 10.0;
        double b = 20.0;

        double expected = 10.0;
        double actual = Math.min(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void roundDoubleToClosestLong() {
        double myDouble = 4.55;

        long expected = 5;
        long actual = Math.round(myDouble);

        assertEquals(expected, actual);
    }

    @Test
    public void getSquareRootOfDouble() {
        double d = 25.0;

        double expected = 5.0;
        double actual = Math.sqrt(d);

        assertEquals(expected, actual);
    }

    @Test
    public void getCharAtIndex() {
        String myString = "Fredag";

        char expected = 'a';
        char actual = myString.charAt(4);

        assertEquals(expected, actual);
    }
    
    @RepeatedTest(10)
    public void mergeTwoStringsWithConcat() {
        String string1 = "Fre";
        String string2 = "dag";

        String expected = "Fredag";
        String actual = string1.concat(string2);

        assertEquals(expected, actual);
    }

    @Test
    public void checkIfObjectIsString() {
        String s = "s";

        boolean actual = s instanceof String;

        assertTrue(actual);
    }
}    
