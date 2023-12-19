package se.iths;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void addTwoInts() {
        Calculator calculator = new Calculator();

        int addend = 10;
        int augend = 20;

        int expected = 30;
        int actual = calculator.add(addend, augend);

        assertEquals(expected, actual);
    }

    @Test
    public void divideTwoInts() {
        Calculator calculator = new Calculator();

        int denominator = 20;
        int nominator = 10;

        double expected = 2.0;
        double actual = calculator.divide(denominator, nominator);

        assertEquals(expected, actual);
    }

    @Test
    public void checkIfIntIsEven() {
        Calculator calculator = new Calculator();

        int evenNo = 12;
        int oddNo = 23;

        boolean expected1 = true;
        boolean actual1 = calculator.isEven(evenNo);

        boolean expected2 = false;
        boolean actual2 = calculator.isEven(oddNo);

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void getStringLength() {
        Calculator calculator = new Calculator();

        String str1 = "hej";
        String str2 = "hå";

        int expected = 5;
        int actual = calculator.stringLength(str1, str2);

        assertEquals(expected, actual);
    }
}
