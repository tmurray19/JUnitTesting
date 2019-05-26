package junitEssentials.junitSuites;

import static org.junit.Assert.*;
import org.junit.Test;

public class SuiteTest1 {

	@Test
	public void testPrintMessage() {
		int num = 5;
		//num = 65631;
		// Just to show to the user that the code is running
		System.out.println("The JUnit test class 'SuiteTest1' is now executing.");
		assertEquals(5, num);
	}
}
