package com.wipro.FlowControlStatements;

public class Q8 {
public static void main(String[] args) {
	String first = args[0];
	//int move;
	if(first.charAt(0) >= 'a' && first.charAt(0) <= 'z')
	{
		System.out.println(first+ "->"+first.toUpperCase());
	}
	else
	{
		System.out.println(first+"->"+first.toLowerCase());
	}
}
}
