package com.wipro.Arrays;

public class Arrays_13 {
public static void main(String[] args) {
	int inc;
	int dec;
	int check = 0;
	int arra[][] = new int[2][2];
		for(inc = 0 ; inc < 2 ; inc ++)
		{
			for(dec = 0 ; dec < 2 ; dec ++)
			{
				check = Integer.parseInt(args[2* inc + dec]);
				arra[inc][dec] = check;
			}
		}
	
		System.out.println("The given array is :");
		for(inc = 0 ; inc <= 1 ; inc ++)
		{
			for(dec = 0 ; dec <= 1 ; dec ++)
			{
				System.out.print(arra[inc][dec] + " ");
			}
			System.out.println();
		}
		System.out.println("The reverse of the array is :");
		for(inc = 1 ; inc >= 0 ; inc --)
		{
			for(dec = 1 ; dec >= 0 ; dec --)
			{
				System.out.print(arra[inc][dec] + " ");
			}
			System.out.println();
		}
}
}

