package com.wipro.Arrays;

public class Arrays_3 {
	public static void main(String[] args) {
		//int number = Integer.parseInt(args[0]);
		int number = 6;
		int arra[] = new int[] {3,5,7,9,11};
		int inc;
		int check = 0;
		int store = 0;
		for(inc = 0 ; inc < arra.length; inc ++)
		
			if(arra[inc] == number)
			{
				check = 1;
				store = inc;
				break;
			}
		if(check == 1)
		{
			System.out.println("The Position of the element in the array given is:" + store);
		}
		else
		{
			System.out.println(-1);
		}
	}
}
