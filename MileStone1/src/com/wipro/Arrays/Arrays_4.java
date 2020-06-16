package com.wipro.Arrays;

public class Arrays_4 {
	public static void main(String[] args) {
		int arra[] = new int[args.length];
		int inc;
		int dec = 0;
		int check = 0;
		char character = 0;
		for(inc = 0 ; inc < args.length ; inc ++)
		{
			check = Integer.parseInt(args[inc]);
			arra[inc] = check;
		}
		for(inc = 0 ; inc < arra.length ; inc ++)
		{
			character = (char)arra[inc];
			System.out.print(character + " ");
			
		}
	}
}
