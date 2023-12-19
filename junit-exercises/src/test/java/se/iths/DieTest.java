package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DieTest {
    @Test
    public void checkIfDieHasValidValue() {
        try {
            Die die = new Die(6);

            die.roll();

            assertTrue(die.getCurrentValue() > 0);
        } catch (Exception e) {
            System.out.println("Fel..");
        }
    }
    
    @Test
    public void checkIfObjectsAreEqual() {
        try {
            Die die = new Die(6);
            Die die2 = new Die(6);
            Die die3 = new Die(5);
            String s = "String";

            assertTrue(die.equals(die));
            assertTrue(die.equals(die2));
            assertFalse(die.equals(die3));
            assertFalse(s.equals(die));

        } catch (Exception e) {
            System.out.println("Fel..");
        }        
    }

    @Test
    public void checkThrownException() {
        try {
            Die die = new Die(-1);

            die.roll();

        } catch (Exception e) {
            System.out.println("Fel..");
        } 
    }
}
