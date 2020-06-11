package com.wipro.FlowControlStatements;

public class Q2 {

	public static void main(String[] args) {
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		String s = lastdigit(first,second);
		System.out.println(s);
	}

	public static String lastdigit(int one, int two)
	{
		if(one % 10 == two % 10)
		{
		return "true";
		}
		else
		{
			return "false";
		}
		
	}
	}
