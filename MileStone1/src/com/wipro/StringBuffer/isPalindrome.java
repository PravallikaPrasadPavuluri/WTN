package com.wipro.StringBuffer;
import java.util.*;
public class isPalindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int len;
	len = str.length();
	int i;
	int cnt = 0;
	for(i = 0 ; i < len ; i ++)
	{
		if(str.charAt(i) == str.charAt(len - i - 1))
		{
			cnt = 0;
		}
		else
		{
			cnt ++;
		}
	}
	if(cnt == 0)
	{
		System.out.println("The given string is palindrome");
	}
	else
	{
		System.out.println("The given string is not palindrome");
	}
}
}
