package calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeTest
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        double result = calculator.add(3.2, 4.3);
        Assert.assertEquals(result, 7.5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivide() {
        calculator.divide(3.2, 0);
    }

}