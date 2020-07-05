package com.wipro.StringBuffer;
import java.util.*;
public class EvenString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int len;
	len = str.length();
	//int check = 0;
	int i;
	String res = "";
	if(len % 2 != 0)
	{
		res = res + "null";
	}
	else
	{
			res = res + str.substring(0,len/2);
	}
	System.out.println(res);
}
}
