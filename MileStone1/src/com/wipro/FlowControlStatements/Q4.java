package com.wipro.FlowControlStatements;

public class Q4 {
public static void main(String[] args) {
	int i;
    //int j = 0;
	if(args.length == 0)
	{
		System.out.println("No Values");
	}
	else
	{
		System.out.print(args[0]);
		for(i = 1 ; i <args.length ; i ++)
		{
			System.out.print(","+args[i]);
		}
		
	}
}
}
