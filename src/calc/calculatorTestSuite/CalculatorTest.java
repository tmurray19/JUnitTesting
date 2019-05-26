package calc.calculatorTestSuite;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    
    // Ignoring tests
    // We can also add messages explaining the ignore
    @Ignore("I don't want to test this method right now, I know the outcome of it.")
    @Test
    public void testMain() {
    	assertFalse(true);

    }
    
}
