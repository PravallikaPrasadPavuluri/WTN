package com.wipro.FlowControlStatements;

public class Q17 {
public static void main(String[] args) {
	int number = Integer.parseInt(args[0]);
	int finalnum = 0;
	int help;
	for(finalnum = 0 ; number != 0 ; number = number / 10)
	{
		help = number % 10;
		finalnum = finalnum * 10 + help;
	}
	System.out.println(finalnum);
}
}
