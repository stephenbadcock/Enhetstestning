package se.iths;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.*;
import static org.mockito.Mockito.*;

public class TestComputer {

    @Test
    public void eightPlusElevenEquals19() {
        // 1. Create Computer object to use as test object.
        // 2. Make sure Calculator is mocked to enable stubbing of output.
        // 3. Stub CalculatorMock to output correct value when add()-method is called.
        // 4. Use compute()-method to compute sum of 8 and 11. (Code Under Test)
        // 5. Assert that the result from {4} is equal to the expected result (19).
    }

    @Test
    public void threeTimesSixEqualsEighteen() {
        // 1. Create Computer object to use as test object.
        // 2. Make sure Calculator is mocked to enable stubbing of output.
        // 3. Stub CalculatorMock to output correct value when multiply()-method is called.
        // 4. Use compute()-method to compute product of 3 and 6. (Code Under Test)
        // 5. Assert that the result from {4} is equal to the expected result (18).
    }

    @Test
    public void twelveMinusSevenEqualsFive() {
        // 1. Create Computer object to use as test object.
        // 2. Make sure Calculator is mocked to enable stubbing of output.
        // 3. Stub CalculatorMock to output correct value when subtract()-method is called.
        // 4. Use compute()-method to compute the difference between 12 and 7. (Code Under Test)
        // 5. Assert that the result from {4} is equal to the expected result (5).
    }

    @Test
    public void twoPowerOfFourEquals64() {
        // 1. Create Computer object to use as test object.
        // 2. Make sure Calculator is mocked to enable stubbing of output.
        // 3. Stub CalculatorMock to output correct value when power()-method is called.
        // 4. Use compute()-method to compute 2 to the power of 4 (2^4). (Code Under Test)
        // 5. Assert that the result from {4} is equal to the expected result (64).
    }

    @Test
    public void invalidModeThrowsException() {
        // 1. Create Computer object to use as test object.
        // 2. Assert that an InvalidArgumentException is thrown when the compute()-method is used with invalid mode. (Code Under Test)
    }
}
