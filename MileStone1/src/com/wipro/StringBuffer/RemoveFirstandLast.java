package com.wipro.StringBuffer;
import java.util.*;
public class RemoveFirstandLast {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int len;
	len = str.length();
	String res = "";
	res = res + str.substring(1,len - 1);
	System.out.println(res);
}
}
