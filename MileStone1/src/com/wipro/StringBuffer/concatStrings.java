package com.wipro.StringBuffer;
import java.util.*;
public class concatStrings {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String str1 = sc.nextLine();
	int len;
	len = str.length();
	str = str.toLowerCase();
	str1 = str1.toLowerCase();
	StringBuffer s = new StringBuffer();
	s.append(str);
	if(str.charAt(len - 1) == str1.charAt(0))
	{
		s.append(str1.substring(1, str1.length()));
	}
	else
	{
		s.append(" ");
		s.append(str1);
	}
	System.out.println(s);
}
}
