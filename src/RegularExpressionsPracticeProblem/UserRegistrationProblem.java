package RegularExpressionsPracticeProblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {

	public static void main(String[] args) {
		ValidFirstName rv1 = new ValidFirstName();
		ValidLastName rv2 = new ValidLastName();
		ValidEmail rv3 = new ValidEmail();
		rv1.firstname();
		rv2.lastname();
		rv3.validEmail();
	}
}

class ValidFirstName {
	public void firstname() {
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

class ValidLastName {
	public void lastname() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a valid Last Name");
		Pattern p = Pattern.compile("\\b([A-Z]\\w*)\\b");
		String lastName = userInput.next();
		Matcher matcher = p.matcher(lastName);
		if (matcher.find()) {
			System.out.println("Last Name => " + lastName);
		} else {
			System.out.println("Invalid Character");
		}
	}
}

class ValidEmail {
	 void validEmail() {
		 Scanner userInput = new Scanner(System.in);
			System.out.println("Enter a valid email");
			String regex = "^(.+)@(.+)$";
			String email = userInput.next();
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			if (matcher.find()) {
				System.out.println("email => " + email);
			} else {
				System.out.println("Invalid email");
			}
	 }
}
