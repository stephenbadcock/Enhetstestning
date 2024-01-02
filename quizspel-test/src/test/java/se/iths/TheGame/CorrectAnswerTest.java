package se.iths.TheGame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CorrectAnswerTest {
    @Test
    public void returnAnswerText() {
        Answer correctAnswer = new CorrectAnswer("Testar att hämta svarstext");

        assertEquals("Testar att hämta svarstext", correctAnswer.getAnswerText());
    }
}
