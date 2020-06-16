package com.wipro.Arrays;

public class Arrays_7 {
	public static void main(String[] args) {
	int arra[] = new int[args.length];
	int inc;
	int m = 0;
	int n;
	int res_arra[] = new int[args.length];
	for(inc = 0 ; inc < args.length ; inc ++)
	{
		int check = Integer.parseInt(args[inc]);
		arra[inc] = check;
	}
	for(inc = 0 ; inc < args.length ; inc ++)
	{
		System.out.print(arra[inc] + " ");
	}
	for(int i =0;i<arra.length;i++)
	{
		for(int j=0;j<arra.length-1;j++)
		{
			if(arra[j]>arra[j+1])
			{
				n = arra[j];
				arra[j] = arra[j+1];
				arra[j+1] = n;
			}
		}
	}
	System.out.println();
for(int i=0;i<args.length;i++)
	{
			if(res_arra[m]!=arra[i])
			{
				res_arra[m] = arra[i];
				m ++;
			}
	}
	for(int i=1;i<res_arra.length;i++)
	{
		System.out.print(res_arra[i]+" ");
	}
}
}
