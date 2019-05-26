package junitEssentials.junitSuites;


// These imports are all necessary to make various decorators work below
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


// Showcasing how to bundle multiple JUnit test classes into a single test 'suite'

// Tells compiler to use Suite.class
@RunWith(Suite.class)
// Includes tests in the order they need to be tested
// You can add classes here, and they will run in the order top to bottom
@Suite.SuiteClasses({
	SuiteTest1.class,
	SuiteTest2.class,
})
public class TestSuite {

	public TestSuite() {
		
	}

	// This function allows you to set up any variables or instances you might need
	@Before
	public static void setUp() {
		
	}
	
	// This function removes the variables set up for the test cases from memory
	@After
	public static void tearDown() {
		
	}
	
	
	// This runs all the test you want in the suite
	@Test
	public void runSuite() {
		
	}
}
