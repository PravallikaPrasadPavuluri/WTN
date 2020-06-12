package com.wipro.FlowControlStatements;

public class Q15 {
public static void main(String[] args) {
	int number = Integer.parseInt(args[0]);
	int summation = 0;
	int extra = 0;
	for (extra = 0 ; number != 0 ; number = number / 10)
	{
		summation = summation + (number % 10);
	}
	System.out.println(summation);
}
}
