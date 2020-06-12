package com.wipro.FlowControlStatements;

public class Q18 {
public static void main(String[] args) {
	int number = Integer.parseInt(args[0]);
	int result = 0;
	int variable;
	int copy;
	copy = number;
	for(result = 0 ; copy != 0 ; copy = copy / 10)
	{
		variable = copy % 10;
		result = result * 10 + variable;
	}
	if(number == result)
	{
		System.out.println("This is a Palindrome Number");
	}
	else
	{
		System.out.println("This is not a Palindrome Number");
	}
}
}
