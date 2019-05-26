package calc.calculatorTestSuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
    MultiplyTest.class, 
    DivideTest.class, 
    CalculatorTest.class, 
    SubtractTest.class, 
    SumTest.class})
public class CalculatorSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
