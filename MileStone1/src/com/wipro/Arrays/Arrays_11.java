package com.wipro.Arrays;

public class Arrays_11 {
public static void main(String[] args) {
	int arra[] = new int[args.length];
	int inc;
	int check = 0;
	//int box = 1;
	boolean value = true;
	for(inc = 0 ; inc < args.length ; inc ++)
	{
		check = Integer.parseInt(args[inc]);
		arra[inc] = check;
	}
	for(inc = 0 ; inc < arra.length ; inc ++)
	{
		if(arra[inc] != 1 && arra[inc] != 4)
		{
			value = false;
		}
		else
		{
			value = true;
		}
	}
	System.out.println(value);
}
}
