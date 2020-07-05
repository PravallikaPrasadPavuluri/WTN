package com.wipro.StringBuffer;
import java.util.*;
public class ShortLongString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str1 = sc.nextLine();
	String str2 = sc.nextLine();
	String res = "";
	int len1;
	int len2;
	len1 = str1.length();
	len2 = str2.length();
	if(len1 > len2)
	{
		res = res + str2 + str1 + str2;
	}
	else
	{
		res = res + str1 + str2 + str1;
	}
	System.out.println(res);
}
}
