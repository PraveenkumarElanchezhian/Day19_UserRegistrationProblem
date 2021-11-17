package RegularExpressionsPracticeProblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {

	public static void main(String[] args) {
		ValidFirstName rv1 = new ValidFirstName();
		rv1.firstname();
	}
}

class ValidFirstName {
	void firstname() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a valid First Name");
		Pattern p = Pattern.compile("\\b([A-Z]\\w*)\\b");
		String firstName = userInput.next();
		Matcher matcher = p.matcher(firstName);
		if (matcher.find()) {
			System.out.println("First Name => " + firstName);
		} else {
			System.out.println("Invalid Character");
		}
	}
}
