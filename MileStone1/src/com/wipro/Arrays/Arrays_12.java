package com.wipro.Arrays;

public class Arrays_12 {
	public static void main(String[] args) {
		
	
int arra1[] = new int[3];
int arra2[] = new int[3];
int res_arra[] = new int[2];
int inc;
int check;
int m = 0;
for(inc = 0 ; inc < 3 ; inc ++)
{
	check = Integer.parseInt(args[inc]);
	arra1[inc] = check;
}
for(inc = 3 ; inc < 6 ; inc ++)
{
	check = Integer.parseInt(args[inc]);
	arra2[m] = check;
	m ++;
}
	res_arra[0] = arra1[1];
	res_arra[1] = arra2[1];
	for(inc = 0 ; inc< 2 ; inc ++)
	{
		System.out.print(res_arra[inc] + " ");
	}

}
}
