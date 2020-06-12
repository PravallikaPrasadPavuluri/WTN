package com.wipro.FlowControlStatements;

public class Q14 {
public static void main(String[] args) {
	int first;
	int second;
	int incrementer = 0;
	for(first = 10 ; first <= 99 ; first ++)
	{
		incrementer = 0;
		for(second = 1 ; second < first ; second ++)
		{
			if(first % second == 0)
			{
				 incrementer ++;
			}
		}
		if(incrementer == 1)
		{
			System.out.println(first);
		}
		}
	}
}


