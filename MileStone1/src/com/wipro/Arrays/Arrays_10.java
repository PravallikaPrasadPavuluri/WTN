package com.wipro.Arrays;

public class Arrays_10 {
public static void main(String[] args) {
	int arra[] = new int[args.length];
	int arra1[] = new int[args.length];
	int inc;
	int first = 0;
	int second = args.length - 1;
	int check = 0;
	for(inc = 0 ; inc < args.length ; inc ++)
	{
		check = Integer.parseInt(args[inc]);
		arra[inc] = check;
	}
	for(inc = 0 ; inc < arra.length ; inc ++)
	{
		if(arra[inc] % 2 == 0)
		{
			arra1[first] = arra[inc];
			first ++;
		}
		else
		{
			arra1[second] = arra[inc];
			second --;
		}
		}
	for(inc = 0 ; inc < args.length ; inc ++)
	{
		System.out.print(arra1[inc] + " ");
	}
	}
}

