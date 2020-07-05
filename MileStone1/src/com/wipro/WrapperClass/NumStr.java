package com.wipro.WrapperClass;
import java.util.*;
public class NumStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tot = sc.nextInt();
		
		String res = String.format("%8s", Integer.toBinaryString(tot)).replace(' ', '0');
		System.out.println(res);
}
}
