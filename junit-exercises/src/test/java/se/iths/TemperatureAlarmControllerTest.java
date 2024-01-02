package se.iths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureAlarmControllerTest {
    TemperatureAlarmController controller;

    @BeforeEach
    public void setup() {
        controller = new TemperatureAlarmController();
    }

    @Test
    public void greenLightWhenTempIs69() {
        controller.setTemperature(69);
        controller.checkState();
        
        assertEquals("GREEN", controller.lampColor);
    }

    @Test
    public void redLightWhenTempIs96() {
        controller.setTemperature(96);
        controller.checkState();

        assertEquals("RED", controller.lampColor);        
    }

    @Test
    public void yellowLightWhenTempIs70() {
        controller.setTemperature(70);
        controller.checkState();

        assertEquals("YELLOW", controller.lampColor);
    }    

    @Test
    public void alarmIsEngagedAt96() {
        controller.setTemperature(96);
        controller.checkState();

        assertTrue(controller.alarmOn);
    }
}
