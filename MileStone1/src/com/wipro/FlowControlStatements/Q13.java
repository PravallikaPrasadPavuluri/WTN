package com.wipro.FlowControlStatements;

public class Q13 {
public static void main(String[] args) {
	int number = Integer.parseInt(args[0]);
	int i;
	int incrementer = 0;
	for(i = 1 ; i <= Math.sqrt(number) ; i ++)
	{
		if(number % i == 0)
		{
			incrementer ++;
		}
	}
	if(incrementer == 1)
	{
		System.out.println("This is a Prime Number");
	}
	else
	{
		System.out.println("This is not a Prime Number");
	}
}
}
