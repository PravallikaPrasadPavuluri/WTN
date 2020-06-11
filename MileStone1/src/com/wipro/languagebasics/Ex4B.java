// Using Command Line Arguments

package com.wipro.languagebasics;

public class Ex4B {
public static void main(String[] args) {
	int first = Integer.parseInt(args[0]);
	int second = Integer.parseInt(args[1]);
	int result1;
	int result2;
	result1 = first % 10;
	result2 = second % 10;
	if(result1 == result2)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
}
}
