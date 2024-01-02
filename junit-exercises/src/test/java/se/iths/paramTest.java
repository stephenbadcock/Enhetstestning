package se.iths;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class paramTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 444, 8, -2, -1114, 0})
    public void checkIfEven(int input) {
        Calculator calculator = new Calculator();

        assertTrue(calculator.isEven(input));
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    @ParameterizedTest
    @ValueSource(strings = {"kajak", "bob"})
    public void realPalindromeReturnsTrue(String inputString) {
        assertTrue(isPalindrome(inputString));
    }
}
