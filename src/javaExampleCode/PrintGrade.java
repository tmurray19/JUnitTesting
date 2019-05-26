package javaExampleCode;


// Inputs a percentage number, and outputs a numeric grade
public class PrintGrade {
	public String printGrade(int grade) {

		if (grade >= 70 ) {
			return "Your grade is an A.";
		}
		else if (grade >= 60 ) {
			return "Your grade is a B.";
		}
		else if (grade >= 50 ) {
			return "Your grade is a C.";
		}
		else if (grade >= 40 ) {
			return "Your grade is a D.";
		}
		else {
			return "You failed.";
		}
	}
}
