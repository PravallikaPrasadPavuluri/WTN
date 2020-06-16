package com.wipro.Arrays;

public class Arrays_5 {
	public static void main(String[] args) {
		int arra[] = new int[] {3,4,5,6,7,8};
		int row;
		int col;
		int len;
		int check = 0;
		len = arra.length;
		int first_maximum = 0;
		int first_minimum = 0;
		int second_maximum = 0;
		int second_minimum = 0;
		for(row = 0; row < len - 1 ; row ++)
		{
			for(col = 0 ; col < len - row - 1 ; col ++)
			{
				if(arra[col] > arra[col + 1])
				{
					check = arra[col];
					arra[col] = arra[col + 1];
					arra[col + 1] = check;
				}
			}
		}
		for(row = 0 ; row < len ; row ++)
		{
			first_maximum = arra[len -1];
			second_maximum = arra[len - 2];
			first_minimum = arra[0];
			second_minimum = arra[1];
		}
		System.out.println("The maximum numbers are :" + first_maximum + " " + "&" +" " + second_maximum);
		System.out.println("The minimum numbers are :" + first_minimum + " " + "&" +" " + second_minimum);
		
	}
}
