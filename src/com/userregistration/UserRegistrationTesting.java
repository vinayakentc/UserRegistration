package com.userregistration;


import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTesting {
    
	 @Test
	    public void givenFirstName_Proper_ReturnTrue() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.firstNameValidator("Vinayak");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenFirstName_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.firstNameValidator("vinayak");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenLastName_Proper_ReturnTrue() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.lastNameValidator("Chavan");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenLastName_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.lastNameValidator("chavan");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenEmail_Proper_ReturnTruee() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.emailValidator("abc.xyz@bridgelabz.co.in");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenEmail_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.emailValidator("abc.co.in");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenPassword_Proper_ReturnTrue() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.passwordValidator("Vinayak@765");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenPassword_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.passwordValidator("asfgsgfd");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenMobileNo_Proper_ReturnTrue() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.mobileNoValidator("91 1234567890");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenMobileNo_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.firstNameValidator("12345");
	        Assert.assertFalse(false);
	    }
}