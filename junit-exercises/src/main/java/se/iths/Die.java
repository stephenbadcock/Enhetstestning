package se.iths;

import java.util.Random;

public class Die {
    private int sides;
    private int currentValue;

    private Random generator = new Random();

    public Die(int sides) throws Exception {
        if (sides <= 0) throw new Exception("Error: Die parameter sides must be a positive integer.");
        this.sides = sides;
    }

    public void roll() {
        currentValue = generator.nextInt(sides)+1;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        if (!(obj instanceof Die)) return false;

        Die die = (Die) obj;
        
        if (die.sides == sides) return true;
        else return false;
    }
}
