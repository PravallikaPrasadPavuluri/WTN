package com.wipro.ExceptionHandling;

public class UserRegistration {
	public void registerUser(String username, String userCountry) 
	 {
	  if (!userCountry.equals("India"))
	   System.out.println("InvalidCountryException");
	  else
	   System.out.println("User registration done successfully");
	  
	  
	 }

	 public static void main(String[] args) {
	  UserRegistration registration = new UserRegistration();
	  try 
	  {
	   registration.registerUser("puppy", "India");
	  } 
	  catch (Exception e) 
	  {
	  }
	  
	 }
}
