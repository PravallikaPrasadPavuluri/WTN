package com.wipro.StringBuffer;
import java.util.*;
public class LastCharacters {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int len;
	len = str.length();
	int i;
	int num = sc.nextInt();
	String res = "";
	for(i = 0 ; i < num ; i ++)
	res = res + str.substring(len - (num), len);
	System.out.println(res);
}
}
