package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void personIsAnAdult() {
        Person person = new Person("Claes", 42);

        assertTrue(person.isAdult());
    }
    
    @Test
    public void personIsntAnAdult() {
        Person person = new Person("Måns", 12);

        assertFalse(person.isAdult());
    }     

    @Test
    public void DetailsFormatAreTheSame() {
        Person person = new Person("Claes", 42);

        assertEquals("Claes, 42", person.getDetails());
    }

    @Test
    public void DetailsFormatArentTheSame() {
        Person person = new Person("Claes", 42);

        assertNotEquals("Claes 42", person.getDetails());
    }    

    @Test
    public void ageIncreasedOnBirthday() {
        Person person = new Person("Claes", 42);
        person.celebrateBirthday();

        assertEquals(43, person.getAge());
    }

    @Test
    public void twoPersonsNamesAreTheSame() {
        Person person = new Person("Claes", 42);
        Person person2 = new Person("Claes", 11);

        assertTrue(person.hasSameName(person2));
    }

    @Test
    public void twoPersonsNamesArentTheSame() {
        Person person = new Person("Claes", 42);
        Person person2 = new Person("Milo", 41);

        assertFalse(person.hasSameName(person2));
    }    
}
