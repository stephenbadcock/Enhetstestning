package se.iths;

/*
Vid temperatur under 70 grader skall en Grön lampa lysa. Alarmet skall inte vara igång.
Vid temperatur mellan 70 och 95 grader skall en Gul lampa lysa. Alarmet skall inte vara igång.
Vid temperatur över 95 grader skall en Röd lampa lysa. Alarmet skall vara igång.

Lampans ljus representeras av en public String variabel med värdena "GREEN", "YELLOW" eller "RED". 
Har de något annat värde är det fel på lampan!

Larmet tjuter om boolean-variabeln alarmOn är true.
 */

public class TemperatureAlarmController {
    private int temperature;
    public String lampColor = "OFF";

    public boolean alarmOn;

    public void checkState() {
        if (temperature < 70) {
            lampColor = "GREEEN";
            System.out.println("Everything is fine!");
        }
        else if (temperature >= 95) {
            lampColor = "RED";
            engageAlarm();
            System.out.println("It's burning up in here!");
        }
        else if (temperature > 70) {
            lampColor = "YELLOW";
            System.out.println("Things are heating up!");
        }

    }

    public void engageAlarm() {
        alarmOn = true;
        if (temperature > 100) lampColor = "FLASHING RED";
        System.out.println("ALARM STATUS: ENGAGED!");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
