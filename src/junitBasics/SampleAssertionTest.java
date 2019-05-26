package junitBasics;
import static org.junit.Assert.*;

import org.junit.Test;



// Showcasing various tests
public class SampleAssertionTest {
	
	//assertArrayEquals
	@Test
	public void testAssertArrayEquals() {
		byte[] expected = "test".getBytes();
		byte[] actual = "test".getBytes();
		assertArrayEquals("Failure - byte arrays not same", expected, actual);
		
	}


	// Checks to see that two primitives are equal
	@Test
	public void testAssertEquals() {
		assertEquals("Failure - strings are not equal", "text", "text");
	}
	
	
	// Checks that a condition is false

	@Test
	public void TestAssertsFalseFail() {
		// This test is designed to fail
		assertFalse("Failure - should be false", true);
	}
	
	// Checks that a condition is false
	@Test
	public void TestAssertsFalse() {
		assertFalse("Failure - should be false", false);
	}
	
	@Test
	public void testAssertNotNull() {
		assertNotNull("Should not be null", new Object());
	}
	
	@Test
	public void testAssertNotSame() {
		assertNotSame("Should not be the same object", new Object(), new Object());
	}
	
	@Test
	public void testAssertNull() {
		assertNull("Should be null", null);
	}
	
	@Test
	public void testAssertSameNum() {
		Integer num = Integer.valueOf(62);
		assertSame("Should be the same", num, 62);
	}
	
	@Test
	public void testAssertSame() {
		Integer num = Integer.valueOf(62);
		assertSame("Should be the same", num, num);
	}
	
	@Test 
	public void testAssertTrue() {
		assertTrue("Failure - should be true", true);
	}
	
}
