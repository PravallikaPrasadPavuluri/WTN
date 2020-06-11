package com.wipro.FlowControlStatements;

public class Q1 {
public static void main(String[] args) {
	int number = Integer.parseInt(args[0]);
	if(number > 0)
	{
		System.out.println("It is a Positive Number");
	}
	else if(number == 0)
	{
		System.out.println("It is Zero");
	}
	else
	{
		System.out.println("It is Negative Number");
	}
}
}
