package com.wipro.FlowControlStatements;

public class Q6 {
	public static void main(String[] args) {
		String s1 = args[0];
		if((s1.charAt(0) >= 'a' && s1.charAt(0) <= 'z') || (s1.charAt(0) >= 'A' && s1.charAt(0) <= 'Z'))
		{
			System.out.println("It is an Alphabet");
		}
		else if(s1.charAt(0) >= '0' && s1.charAt(0) <= '9')
		{
			System.out.println("It is a Number");
		}
		else
		{
			System.out.println("It is a Special Character");
		}
	}

}
