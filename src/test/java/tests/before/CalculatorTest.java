package tests.before;

import org.junit.Assert;
import org.junit.Test;
import uk.co.allantong.libraries.Calculator;


/* Notice in this class, that we have very intentionally NOT placed the Calculator instance
at the Class Scope Level. This is done, in order to ensure that one test doesn't interfere with another
Additionally, that also means the tests can be executed in any order
 */
public class CalculatorTest {

    /* @Test is known as an ANNOTATION
    Annotation had special functionality to a Class or Method
     */
    @Test
    public void validateThatTheSumOfTenPlusTwentyEqualsThirty() {
        // Setup: Given
        Calculator calculator = new Calculator();

        // Execute: When
        double actual = calculator.add(10, 20);

        // Evaluate: Then
        double expected = 30.0;
        Assert.assertEquals(expected, actual, 0);
    }

    /* This looks like duplication, but is not
    Every test must have ONE and ONLY ONE Objective
    Principle of Test Independence
    An alternate technique solution would be to use a data driven test when a pattern is observed
     */
    @Test
    public void validateThatTheSumOfFourteenPlusNinetyEqualsHundredAndFour() {
        // Setup: Given
        Calculator calculator = new Calculator();

        // Execute: When
        double actual = calculator.add(14, 90);

        // Evaluate: Then
        double expected = 104.0;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void validateThatASavedValueCanBeRetrieved() {
        // Setup: Given
        double expected = 134.7653;
        Calculator calculator = new Calculator();

        // Execute: When
        calculator.setInMemory(expected);

        // Evaluate: Then
        double actual = calculator.getInMemory();
        Assert.assertEquals(expected, actual, 0);

    }

}
