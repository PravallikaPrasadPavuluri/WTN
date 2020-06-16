package com.wipro.Arrays;

public class Arrays_9 {
public static void main(String[] args) {
	int arra[] = new int[args.length];
	int res_arra[] = new int[args.length];
	int inc;
	int first = 0;
	int second = args.length - 1;
	int check = 0;
	for(inc = 0 ; inc < args.length ; inc ++)
	{
		check = Integer.parseInt(args[inc]);
		arra[inc] = check;
	}
	for(inc = 0 ; inc <arra.length ; inc ++)
	{
		if(arra[inc] != 10)
		{
			res_arra[first] = arra[inc];
			first ++;
		}
		else
		{
			res_arra[second] = 0;
			second --;
		}
	}
	for(inc = 0 ; inc < res_arra.length ; inc ++)
	{
		System.out.print(res_arra[inc] + " ");
	}
}
}
