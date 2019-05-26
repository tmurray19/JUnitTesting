package junitEssentials.junitSuites;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuiteTest2 {

	@Test
	public void testPrintMessage() {
		String hello = "Hello, World!";
		// Just to show to the user that the code is running
		System.out.println("The JUnit test class 'SuiteTest2' is now executing.");
		assertNotNull(hello);
		assertEquals("Hello, World!", hello);
	}

}
