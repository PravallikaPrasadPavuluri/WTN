package com.wipro.StringBuffer;
import java.util.*;
public class CopyString {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
int i;
int times = sc.nextInt();
StringBuffer s = new StringBuffer();
for(i = 0 ; i < times ; i ++)
{
	s.append(str.substring(0,2));
}
System.out.println(s);
}
}
