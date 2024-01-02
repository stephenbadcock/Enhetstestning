package se.iths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void tenPlusTwentyEqualsThirty() {
        int addend = 10;
        int augend = 20;

        assertEquals(30, calculator.add(addend, augend));
    }

    @Test
    public void twentyDividedByTenEqualsTwoPointZero() {
        int denominator = 20;
        int nominator = 10;

        assertEquals(2.0, calculator.divide(denominator, nominator));
    }

    @Test
    public void twelveIsEven() {
        int evenNo = 12;

        assertTrue(calculator.isEven(evenNo));
    }

    @Test 
    public void threeIsOdd() {
        int oddNo = 3;

        assertFalse(calculator.isEven(oddNo));
    }

    @Test
    public void threeCharsPlusTwoCharsEqualsFiveChars() {
        String str1 = "hej";
        String str2 = "hå";

        assertEquals(5, calculator.stringLength(str1, str2));
    }
}
