package com.wipro.FlowControlStatements;

public class Q9 {
public static void main(String[] args) {
	String signal = args[0];
	switch(signal.charAt(0))
	{
	case 'R': System.out.println(signal+"->"+"Red");
				break;
	case 'B': System.out.println(signal+"->"+"Blue");
				break;
	case 'Y': System.out.println(signal+"->"+"Yellow");
				break;
	case 'G': System.out.println(signal+"->"+"Green");
				break;
	case 'O': System.out.println(signal+"->"+"Orange");
				break;
	case 'W': System.out.println(signal+"->"+"White");
				break;
	default:System.out.println("None of the above");
	break;
	}
}
}
