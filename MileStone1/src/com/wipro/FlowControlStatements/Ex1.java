package com.wipro.FlowControlStatements;

public class Ex1 {
	public static void main(String[] args) {
	int input = Integer.parseInt(args[0]);
	if(input > 0)
	{
		System.out.println("It is a Positive Number");
	}
	else if(input == 0)
	{
		System.out.println("It is Zero");
	}
	else
	{
		System.out.println("It is a Negative Number");
	}
}
}
