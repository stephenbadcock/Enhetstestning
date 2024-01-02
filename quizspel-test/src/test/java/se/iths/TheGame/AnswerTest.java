package se.iths.TheGame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnswerTest {
    @Test
    public void returnAnswerText() {
        Answer answer = new Answer("Testar att hämta svarstext");

        assertEquals("Testar att hämta svarstext", answer.getAnswerText());
    }
}
