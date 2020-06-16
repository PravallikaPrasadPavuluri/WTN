package com.wipro.Arrays;

public class Arrays_2 {
	public static void main(String[] args) {
		int arra[] = new int[] {3,5,7,9,10};
		int minimum = arra[0];
		int maximum = arra[0];
		for(int inc: arra)
		{
			if(inc > maximum)
			{
				maximum = inc;
			}
			else if(inc < maximum)
			{
				minimum = inc;
			}
		}
		System.out.println("The maximum number is:" + maximum);
		System.out.println("The minimum number is:" + minimum);
	}
}
