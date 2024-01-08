package se.iths;

// import java.util.ArrayList;
// import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class RunTest {
    Run run;

    @BeforeEach
    public void setup() {
        run = new Run(4.5, 0, 14, 30, "2024-01-02");
    }

    @Test
    public void distanceDividedByTimeEqualsSpeed() {
        double runSpeed = run.calculateRunSpeed();

        assertEquals(18.6, runSpeed);
    }

    @Test
    public void timeDividetByDistanceEqualsKilometerTime() {
        String kilometerTime = run.calculateKilometerTime();

        assertEquals("3:22", kilometerTime);
    }
}
