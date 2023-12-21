package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class PersonTest {
    Person person;

    @BeforeEach
    public void setup() {
        person = new Person("Claes", 42);
    }

    @Test
    public void checkIfAdult() {
        Person person2 = new Person("Måns", 12);

        assertTrue(person.isAdult());
        assertFalse(person2.isAdult());
    }    

    @Test
    public void checkDetailsFormat() {
        String expected = "Claes, 42";
        String actual = person.getDetails();

        assertEquals(expected, actual);
    }

    @Test
    public void checkIfAgeIncreasedOnBirthday() {
        person.celebrateBirthday();

        int expected = 43;
        int actual = person.getAge();

        assertEquals(expected, actual);
    }

    @Test
    public void checkIfTwoNamesAreTheSame() {
        Person person2 = new Person("Claes", 11);
        Person person3 = new Person("Milo", 41);

        assertTrue(person.hasSameName(person2));
        assertFalse(person.hasSameName(person3));
    }  
}
