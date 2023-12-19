package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void checkIfNotAdult() {
        Person person = new Person("Måns", 12);

        boolean actual = person.isAdult();

        assertFalse(actual);
    }

    @Test
    public void checkIfAdult() {
        Person person = new Person("Claes", 42);

        boolean actual = person.isAdult();

        assertTrue(actual);
    }    

    @Test
    public void checkDetailsFormat() {
        Person person = new Person("Rut", 72);

        String expected = "Rut, 72";
        String actual = person.getDetails();

        assertTrue(actual.equals(expected));
    }

    @Test
    public void checkIfAgeIncreasedOnBirthday() {
        Person person = new Person("Maj", 72);

        int expected = person.getAge() + 1;

        person.celebrateBirthday();
        int actual = person.getAge();

        assertEquals(expected, actual);
    }

    @Test
    public void checkIfTwoNamesAreTheSame() {
        Person person = new Person("Bo", 72);
        Person person2 = new Person("Bo", 11);

        assertTrue(person.hasSameName(person2));
    }

    @Test
    public void checkIfTwoNamesAreNotTheSame() {
        Person person = new Person("Bo", 72);
        Person person2 = new Person("Milo", 11);

        assertFalse(person.hasSameName(person2));
    }    
}
