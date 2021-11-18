package RegularExpressionsPracticeProblem;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class UserRegistrationProblem {

	public static void main(String[] args) {
		UserRegistration rv1 = new UserRegistration();
		ValidLastName rv2 = new ValidLastName();
		ValidEmail rv3 = new ValidEmail();
		MobileFormat rv4 = new MobileFormat();
		PasswordRules rv5 = new PasswordRules();
		rv1.firstname();
		rv2.lastname();
		rv3.validEmail();
		rv4.preDefinedMobileFormat();
		rv5.min_8_character();
	}
}

class UserRegistration {
	public void firstname() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the First Name - Starts with Cap and has minimum 3 characters");
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
		System.out.println("Enter the Last Name - Starts with Cap and has minimum 3 characters");
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
		String regex = ("^(.+)@(.+)$");
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

class MobileFormat {
	public void preDefinedMobileFormat() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a mobile number");
		String mobileNumber = userInput.next();
		Pattern pattern = Pattern.compile("[1-9]{2}[ \\S\\s]{1}+[1-9]*]");
		Matcher matcher = pattern.matcher(mobileNumber);
		if (matcher.find()) {
			System.out.println("pre-defined Mobile number => " + mobileNumber);
		} else {
			System.out.println("Invalid Mobile format");
		}

	}
}

class PasswordRules {
	void min_8_character() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the password - min 8 character");
		String password = userInput.next();
		Pattern pattern = Pattern.compile("(?=.*[a-z])(?=\\S+$).{8,}");
		Matcher matcher = pattern.matcher(password);
		if (matcher.find()) {
			System.out.println("Password => " + password);
		} else {
			System.out.println("Invalid Password");
		}
	}
}