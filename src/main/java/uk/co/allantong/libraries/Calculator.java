package uk.co.allantong.libraries;

public class Calculator {

    // Getter: A method that returns the value of the private variable
    public double getInMemory() {
        return inMemory;
    }

    // Setter: A method that sets the value of the private variable
    //  This mechanism means we can optionally add additional logic before accepting the value provided
    public void setInMemory(double inMemory) {
        this.inMemory = inMemory;
    }

    // Private protected variable. Never give direct access to a variables in a Class
    private double inMemory;

    // Constructor, called when the Class is instantiated
    public Calculator() {
        inMemory = 0;
    }

    //
    public double add(double value1, double value2) {
        return value1 + value2;
    }

    public double subtract(double value1, double value2) {
        return value1 - value2;
    }

    public double divide(double value1, double value2) {
        return value1 / value2;
    }

    public double multiply(double value1, double value2) {
        return value1 * value2;
    }


}
