package calc.calculatorTestSuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import calc.calculator.Subtract;

import static org.junit.Assert.*;


public class SubtractTest {
    
    public SubtractTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of minus method, of class Subtract.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        int a = 17;
        int b = 5;
        Subtract instance = new Subtract();
        int expResult = 12;
        int result = instance.minus(a, b);
        assertEquals(expResult, result);
     
    }
    
}
