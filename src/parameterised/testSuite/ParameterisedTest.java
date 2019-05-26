package parameterised.testSuite;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import parameterised.utils.MathUtils;

// We need to decorate the class as so
@RunWith(value = Parameterized.class)
public class ParameterisedTest {

	private int numA;
	private int numB;
	private int expected;
	
	public ParameterisedTest(int numA, int numB, int expected) {
		this.numA = numA;
		this.numB = numB;
		this.expected = expected;
	}

	// We create a list of parameters
	// Decorate them as such
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object [][] {
			{1,1,2},
			{2,2,4},
			{3,2,5},
			{5,5,10},
			{5,6,11},
			{7,8,15},
			{3,3,5}
		});
	}
	
	// Then we use the assertThat function
	// Which calls the collection of objects
	@Test
	public void addTwoNumbersTest() {
		assertThat(MathUtils.add(numA, numB), is(expected));
	}
}
