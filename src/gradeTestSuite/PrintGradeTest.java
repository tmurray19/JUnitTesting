package gradeTestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import javaExampleCode.PrintGrade;


// Testing a written class
public class PrintGradeTest {

	@Test
	public void test() {
		PrintGrade pg = new PrintGrade();
		String result = pg.printGrade(86);
		
		assertEquals("Your grade is an A.", result);
		assertEquals("Your grade is a B.", result);
	}

}
