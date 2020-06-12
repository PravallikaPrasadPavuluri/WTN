package com.wipro.FlowControlStatements;

public class Q11 {
public static void main(String[] args) {
	int number = Integer.parseInt(args[0]); // Number is 10 as per the question
	int i = 1;
	System.out.print(i);
	for(i = 2 ; i <= number ; i ++)
	{
		System.out.print("\t" + i);
	}
}
}
