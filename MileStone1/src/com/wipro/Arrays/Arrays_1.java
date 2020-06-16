package com.wipro.Arrays;

public class Arrays_1 {
	public static void main(String[] args) {
		//int number = Integer.parseInt(args[0]);
		int arra[] = new int[] {3,5,7,9,10};
		int sum = 0;
		float average = 0.0f;
		for(int i:arra)
		{
			sum = sum + i;
		}
		average = (float)sum/arra.length;
		System.out.println("The sum is :" + sum);
		System.out.println("The average is :" + average);
	}
}
