package com.wipro.FlowControlStatements;

public class Q16 {
public static void main(String[] args) {
	int number = Integer.parseInt(args[0]);
	int first;
	int second;
	for (first = 0 ; first < number ; first ++)
	{
		for(second = 0 ; second <= first ; second ++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
