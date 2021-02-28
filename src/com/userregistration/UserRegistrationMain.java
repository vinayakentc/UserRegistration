package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {

	Scanner in = new Scanner(System.in);

	public boolean firstNameValidator(String firstName) throws UserRegistrationException  {
		//System.out.println("enter your first name");
		//System.out.println("first name should start with uppercase and have min 3 characters");
		//String firstName = in.next();
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(firstName);
		Boolean b = matcher.find();
		if (b)
			System.out.println("First Name is Validated");
		else
			System.out.println("Please enter the name as mentioned");
		return b;

	}

	public boolean lastNameValidator(String lastName) throws UserRegistrationException  {
		//System.out.println("enter your last name");
		//System.out.println("last name should start with uppercase and have min 3 characters");
		//String lastName = in.next();
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(lastName);
		Boolean b = matcher.find();
		if (b)
			System.out.println("last Name is Validated");
		else
			System.out.println("Please enter the name as mentioned");
		return b;

	}

	public boolean emailValidator(String  email) throws UserRegistrationException {
		//System.out.println("Enter your Email :");
        //String email = in.next();
		Pattern pattern = Pattern.compile("^([a-z]){1,}[a-z0-9]*([.+_-]){0,1}[0-9a-z]+(@){1}([0-9a-z]+)(\\.([a-z]){2,}){1}(\\.[a-z]{2,})?$");
		Matcher matcher = pattern.matcher(email);
		Boolean b = matcher.find();
	    if(b)
        	System.out.println("Email is Validated");
        else
        	System.out.println("Please enter the correct mail id");
		return b;  
	}

	public boolean mobileNoValidator(String mobileNo) throws UserRegistrationException {
		//System.out.println("Enter your Mobile No :");
		//String mobileNo = in.nextLine();
		Pattern pattern = Pattern.compile("^\\d{2} [1-9]\\d{9}$");
		Matcher matcher = pattern.matcher(mobileNo);
		Boolean b = matcher.find();
		if (b)
			System.out.println("Mobile No is Validated");
		else
			System.out.println("Please enter the correct mobile no");
		return b;
	}

	public boolean passwordValidator(String password) throws UserRegistrationException {
		//System.out.println("Enter your Password :");
		//String password = in.next();
		Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");
		Matcher matcher = pattern.matcher(password);
		Boolean b = matcher.find();
		if (b)
			System.out.println("Password is Validated");
		else
			System.out.println("Please enter the correct password");
		return b;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to user registration system");

		//UserRegistrationMain newUser = new UserRegistrationMain();

		// first name validator
		//newUser.firstNameValidator();
		//last name validator
		//newUser.lastNameValidator();
		//email validator
		//newUser.emailValidator();
		//mobile no validator
		//newUser.mobileNoValidator();
		//password validator
		//newUser.passwordValidator();
	}
}
