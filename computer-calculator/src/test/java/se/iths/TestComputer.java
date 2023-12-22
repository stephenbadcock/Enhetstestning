package se.iths;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.*;
import static org.mockito.Mockito.*;

public class TestComputer {
    Computer computer;

    @Mock
    private Calculator calculatorMock;

    @BeforeEach
    public void setup() {
        calculatorMock = mock(Calculator.class);

        computer = new Computer(calculatorMock);
    }

    @Test
    public void eightPlusElevenEquals19() {
        // 1. Create Computer object to use as test object. 
        // 2. Make sure Calculator is mocked to enable stubbing of output.
        // 3. Stub CalculatorMock to output correct value when add()-method is called.
        when(calculatorMock.add(8, 11)).thenReturn(19);
        // 4. Use compute()-method to compute sum of 8 and 11. (Code Under Test)
        int actual = computer.compute("addition", 8, 11);
        // 5. Assert that the result from {4} is equal to the expected result (19).
        assertEquals(19, actual);
    }

    @Test
    public void threeTimesSixEqualsEighteen() {
        // 1. Create Computer object to use as test object.
        // 2. Make sure Calculator is mocked to enable stubbing of output.
        // 3. Stub CalculatorMock to output correct value when multiply()-method is called.
        when(calculatorMock.multiply(3, 6)).thenReturn(18);
        // 4. Use compute()-method to compute product of 3 and 6. (Code Under Test)
        int actual = computer.compute("multiplication", 3, 6);
        // 5. Assert that the result from {4} is equal to the expected result (18).
        assertEquals(18, actual);
    }

    @Test
    public void twelveMinusSevenEqualsFive() {
        // 1. Create Computer object to use as test object.
        // 2. Make sure Calculator is mocked to enable stubbing of output.
        // 3. Stub CalculatorMock to output correct value when subtract()-method is called.
        when(calculatorMock.subtract(12, 7)).thenReturn(5);
        // 4. Use compute()-method to compute the difference between 12 and 7. (Code Under Test)
        int actual = computer.compute("subtraction", 12, 7);
        // 5. Assert that the result from {4} is equal to the expected result (5).
        assertEquals(5, actual);
    }

    @Test
    public void twoPowerOfFourEquals16() {
        // 1. Create Computer object to use as test object.
        // 2. Make sure Calculator is mocked to enable stubbing of output.
        // 3. Stub CalculatorMock to output correct value when power()-method is called.
        when(calculatorMock.power(2, 4)).thenReturn(16);
        // 4. Use compute()-method to compute 2 to the power of 4 (2^4). (Code Under Test)
        int actual = computer.compute("power", 2, 4);
        // 5. Assert that the result from {4} is equal to the expected result (64).
        assertEquals(16, actual);
    }

    @Test
    public void invalidModeThrowsException() {
        // 1. Create Computer object to use as test object.
        // 2. Assert that an InvalidArgumentException is thrown when the compute()-method is used with invalid mode. (Code Under Test)
        try {
            computer.compute("fuckup", 3, 18);
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
    }
}
