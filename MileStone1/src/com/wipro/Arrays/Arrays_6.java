package com.wipro.Arrays;

public class Arrays_6 {
	public static void main(String[] args) {
		int arra[] = new int[] {2,3,56,8,4,1};
		int row = 0;
		int col;
		int len;
		int check = 0;
		len = arra.length;
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
			System.out.println("The sorted array is :" + arra[row]);
		}
	}
}
