package com.wipro.StringBuffer;
import java.util.*;
public class MixedString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str1 = sc.nextLine();
	String str2 = sc.nextLine();
	int len1 = str1.length();
	int len2 = str2.length();
	String p;
	String q;
	int i;
	if(len1 > len2)
	{
		p = str1;
		q = str2;
	}
	else
	{
		p = str2;
		q = str1;
	}
	//String bigger = a.length() > b.length() ? a : b;
	//String smaller = a.length() < b.length() ? a : b;

	StringBuffer sb = new StringBuffer();

	for ( i = 0; i < q.length(); i++) {
		sb.append(str1.charAt(i)).append(str2.charAt(i));
	}
	
	sb.append(p.substring(q.length(), p.length()));
	
	System.out.println(sb);
}
}
