package com.wipro.StringBuffer;
import java.util.*;
public class StarRemoval {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int len;
	len = str.length();
	int i;
	String res = "";
	if(str.charAt(0) == '*')
	{
		res = res + str.substring(2,len - 1);
	}
	else if(str.charAt(len - 1) == '*')
	{
		res = res + str.substring(0,len - 2);
	}
	else
	{
		for(i = 0 ; i < len ; i ++)
		{
			if(str.charAt(i) == '*')
			{
				res = res + str.substring(0, i - 1) + str.substring(i + 2 , len);
			}
		}
	}
	System.out.println(res);
}
}
