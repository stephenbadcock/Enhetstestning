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
    public void checkIfIntIsOdd() {
        Calculator calculator = new Calculator();

        int num = 23;

        boolean expected = false;
        boolean actual = calculator.isEven(num);

        assertEquals(expected, actual);
    }

    @Test
    public void checkIfIntIsEven() {
        Calculator calculator = new Calculator();

        int num = 12;

        boolean expected = true;
        boolean actual = calculator.isEven(num);

        assertEquals(expected, actual);
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
