package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DieTest {
    @Test
    public void checkIfDieHasValidValue() {
        try {
            Die die = new Die(6);
            die.roll();

            boolean actual = die.getCurrentValue() > 0;

            assertTrue(actual);

        } catch (Exception e) {
            System.out.println("Fel..");
        }
    }

    @Test
    public void checkIfDieHasInvalidValue() {
        try {
            Die die = new Die(6);
            die.roll();

            boolean actual = die.getCurrentValue() <= 0;

            assertFalse(actual);

        } catch (Exception e) {
            System.out.println("Fel..");
        }
    }
    
    @Test
    public void checkIfObjectsAreEqual() {
        try {
            Die die = new Die(6);
            Die die2 = new Die(6);

            assertTrue(die.equals(die2));

        } catch (Exception e) {
            System.out.println("Fel..");
        }        
    }

    @Test
    public void checkIfObjectsAreNotEqual() {
        try {
            Die die = new Die(6);
            Die die2 = new Die(5);

            assertFalse(die.equals(die2));

        } catch (Exception e) {
            System.out.println("Fel..");
        }        
    }
    
    @Test
    public void checkIfObjectsAreTheSame() {
        try {
            Die die = new Die(6);

            assertTrue(die.equals(die));

        } catch (Exception e) {
            System.out.println("Fel..");
        }        
    }
        
}
