package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureAlarmControllerTest {
    @Test
    public void checkTempColour() {
        TemperatureAlarmController controller = new TemperatureAlarmController();

        controller.setTemperature(69);
        controller.checkState();

        String expected = "GREEN";
        String actual = controller.lampColor;
        
        assertEquals(expected, actual);

        controller.setTemperature(70);
        controller.checkState();

        expected = "YELLOW";
        actual = controller.lampColor;

        assertEquals(expected, actual);

        controller.setTemperature(96);
        controller.checkState();

        expected = "RED";
        actual = controller.lampColor;

        assertEquals(expected, actual);
    }

    @Test
    public void checkIfAlarmIsEngaged() {
        TemperatureAlarmController controller = new TemperatureAlarmController();
        controller.setTemperature(96);
        controller.checkState();

        assertTrue(controller.alarmOn);
    }
}
