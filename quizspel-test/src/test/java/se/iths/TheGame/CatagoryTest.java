package se.iths.TheGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatagoryTest {
    Catagory category;

    @BeforeEach
    public void setup() {
        category = new Catagory();
    }

    @Test
    public void ifOneIsChosenCategoryNameIsMusik() {
        String actual = category.chooseCatagory(1);

        assertEquals("musik", actual);
    }

    @Test
    public void ifTwoIsChosenCategoryNameIsSpel() {
        String actual = category.chooseCatagory(2);

        assertEquals("spel", actual);
    }

    @Test
    public void ifThreeIsChosenCategoryNameIsGeografi() {
        String actual = category.chooseCatagory(3);

        assertEquals("geografi", actual);
    }
    
    @Test
    public void ifFourIsChosenCategoryNameIsBlandadeFragor() {
        String actual = category.chooseCatagory(4);

        assertEquals("blandade fragor", actual);
    }    

}
