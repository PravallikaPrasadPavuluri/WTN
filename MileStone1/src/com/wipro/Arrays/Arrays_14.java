package com.wipro.Arrays;

public class Arrays_14 {
	
	public static void main(String[] args) {
		int arra[][] = new int[3][3];
		int inc;
		int dec;
		int maximum = 0;
		int k = 0;
		int m = 0;
		for(inc = 0 ; inc < 3 ; inc ++)
		{
			for(dec = 0 ; dec < 3 ; dec ++)
			{
				m = Integer.parseInt(args[arra.length*inc+dec]);
				arra[inc][dec] = m;
			
			}
		}
		for(inc = 0 ; inc < arra.length ; inc ++)
		{
			for(dec = 0 ; dec < arra.length ; dec++)
			{
			
				if(arra[inc][dec]>maximum)
				{
					maximum= arra[inc][dec];
				}
			}
		}
		for(inc = 0 ; inc < arra.length ; inc ++)
		{
			for(dec = 0 ; dec < arra.length ; dec ++)
			{
				System.out.print(arra[inc][dec]+ " ");
			}
			System.out.println();
		}
		System.out.println("The biggest number of the given array is " + maximum);
		
	}
}