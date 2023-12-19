package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void checkIfAdult() {
        Person person = new Person("Claes", 42);
        Person person2 = new Person("Måns", 12);

        assertTrue(person.isAdult());
        assertFalse(person2.isAdult());
    }    

    @Test
    public void checkDetailsFormat() {
        Person person = new Person("Rut", 72);

        String expected = "Rut, 72";
        String actual = person.getDetails();

        assertEquals(expected, actual);
    }

    @Test
    public void checkIfAgeIncreasedOnBirthday() {
        Person person = new Person("Maj", 72);
        person.celebrateBirthday();

        int expected = 73;
        int actual = person.getAge();

        assertEquals(expected, actual);
    }

    @Test
    public void checkIfTwoNamesAreTheSame() {
        Person person = new Person("Bo", 72);
        Person person2 = new Person("Bo", 11);
        Person person3 = new Person("Milo", 41);

        assertTrue(person.hasSameName(person2));
        assertFalse(person.hasSameName(person3));
    }  
}
