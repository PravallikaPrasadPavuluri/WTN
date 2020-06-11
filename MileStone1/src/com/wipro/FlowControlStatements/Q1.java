package com.wipro.FlowControlStatements;

public class Q1 {
public static void main(String[] args) {
	int first = Integer.parseInt(args[0]);
	if(first > 0)
	{
		System.out.println("It is Positive Number");
	}
	else if(first == 0)
	{
		System.out.println("It is Zero");
	}
	else
	{
		System.out.println("It is Negative Number");
	}
}
}
