/* NAMING CONVENTIONS
Methods: Camel back notation, i.e. starts with word all in lowercase, then Proper word, etc.
    E.g. thisIsAVeryLongMethodNameThatMightNeverEnd

Variables: Same rules as a method

package: All words in lowercase and words separated by a period

Class: Camel back, but all words are Proper
    e.g. MyClassThatDoesSomethingForYou

 */

// The namespace/package this class is assigned to
package uk.co.allantong;


// Reference to the Calculator by fully qualifying its path
import uk.co.allantong.libraries.Calculator;


public class Main {

    // Class level reference, available to any function in this Class
    private static Calculator calculator;

    public static void main(String[] args) {
        /* Local variables, i.e. only available inside of this method
        Notice the absence of the scope names => Private or Public
        PS: This is a block comment :-)
         */
        double first = 100;
        double second = 4;
        double result;

        // Instantiate a new instance of our class
        calculator = new Calculator();

        // Function: Print a message to screen / console
        System.out.println("My Calculator");

        // Perform addition and print a output to the console
        result = runAddition(first, second);
        System.out.println("The sum of " + first + " and " + second + " equals " + result);

    }

    // Private method, only accessible from within the Main Class
    // Returns a double
    // These methods might look redundant, but they are a good way to "bind" or "link" your logical implementation
    // to the physical implementation. That way the two are not direct coupled/linked to each other.
    private static double runAddition(double digit1, double anotherDigit) {
        return calculator.add(digit1, anotherDigit);
    }

    private static double runSubtraction(double digit1, double anotherDigit) {
        return calculator.subtract(digit1, anotherDigit);
    }

    private static double runQuotient(double digit1, double anotherDigit) {
        return calculator.divide(digit1, anotherDigit);
    }

    private static double runMultiplication(double digit1, double anotherDigit) {
        return calculator.multiply(digit1, anotherDigit);
    }

    // Method doesn't return a value, only performs an operation
    private static void saveToMemory(double digit) {
        calculator.setInMemory(digit);
    }

    private static double loadFromMemory() {
        return calculator.getInMemory();
    }

}
