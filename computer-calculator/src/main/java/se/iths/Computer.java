package se.iths;

public class Computer {
    Calculator calculator;

    public Computer(Calculator calculator) {
        this.calculator = calculator;
    }

    public int compute(String mode, int a, int b) {
        switch (mode) {
            case "addition":
                return calculator.add(a, b);

            case "subtraction":
                return calculator.subtract(a, b);
                        
            case "multiplication":
                return calculator.multiply(a, b);

            case "power":
                return calculator.power(a, b);

            default:
                throw new IllegalArgumentException();
        }
    }
}
