package com.wipro.Arrays;

public class Arrays_8 {
	public static void main(String[] args) {
		int arra[] = new int[] {1,6,4,7,9};
		//int inc;
		int checker = 0;
		int sum = 0;
		for(int inc : arra)
		{
			if(inc == 6)
			{
				checker = 1;
			}
			if(checker == 1)
			{
				if(inc == 7)
				{
					checker = 0;
				}
				continue;
			}
			else
			{
				if(inc == 7)
				{
					sum = sum + inc + 6;
				}
				else
				{
				sum = sum + inc;
				}
			}
		}
		System.out.println("Total sum is :" + sum);
	}
}
