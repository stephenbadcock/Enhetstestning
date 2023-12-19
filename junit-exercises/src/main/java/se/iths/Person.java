package se.iths;

/* 
Person(String name, int age) skapar ett nytt Person-objekt med åldern age och namnet name.

isAdult() - returnerar true om en person är 18 år eller äldre.

getDetails() - printar ut namn och ålder på en person på formatet "Namn, ålder".

celebrateBirthday() - printar ut ett grattismeddelande till terminalen och ökar personens ålder med 1.

hasSameName(Person) - returnerar true om två personer har samma namn. Ignorerar stora eller små bokstäver.
 */

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public String getDetails() {
        return name.concat(", " + Integer.toString(age));
    }

    public void celebrateBirthday() {
        System.out.println("Happy Birthday " + name + "!" );
        age++;
    }

    public boolean hasSameName(Person otherPerson) {
        return this.name == otherPerson.name;
    }

    public int getAge() {
        return age;
    }
}
