package com.wipro.FlowControlStatements;

public class Q5 {
public static void main(String[] args) {
	String s1 = args[0];
	String s2 = args[1];
	if(s1.charAt(0)>s2.charAt(0))
	{
		System.out.println(s2 + "," + s1);
	}
	else
	{
		System.out.println(s1 + " " + s2);
	}
}
}
