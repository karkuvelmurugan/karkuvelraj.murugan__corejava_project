package day10.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidEmailException extends RuntimeException {

	public InvalidEmailException(String msg) {
		super(msg);
	}
	public InvalidEmailException(Throwable te) {
		super(te);
	}
	public InvalidEmailException(String msg, Throwable te) {
		super(msg, te);
	}
}

class EmailValidation {
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {
		if (emailId == null) {
			throw new InvalidEmailException("Email cannot be null");
		}
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Boolean isMatch = Pattern.matches(regex, emailId);
		if (!isMatch) {
			throw new InvalidEmailException("Invalid Email Id");
		}
		System.out.println("Valid Email Id");
		return true;
	}
}

public class EmailValidator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email");
		String email = sc.nextLine();
		EmailValidation.isValidEmail(email);
	}
}