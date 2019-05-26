package exceptionHandling.testSuite;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// Showing that you can ignore possible exceptions and errors that could show up
public class ExceptionHandlingTest {

	public ExceptionHandlingTest() {
		
	}
	
	@Before
	public void setUp() {
		
	}
	
	@After
	public void tearDown() {
		
	}
	
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testMain() {
		new ArrayList<Object>().get(0);
	}
	
	@Test (expected = ArithmeticException.class)
	public void testDivideByZero() {
		int x = 0/0;
	}
	
	// We know that this is going to fail
	@Test //(expected = ArithmeticException.class)
	public void testDivideByZeroFailed() {
		int y = 0/0;
	}
}
