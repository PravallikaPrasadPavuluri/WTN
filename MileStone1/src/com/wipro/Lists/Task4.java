package com.wipro.collections;
import java.util.*;
public class Task4 {
public static void main(String[] args) {
	List<Object> l1 = new ArrayList<>();
	try
	{
		l1.add(100);
		l1.add(100.19F);
		l1.add(100.19344D);
		l1.add("KLU-Wipro");
	}
	catch(Exception e)
	{
		System.out.println("Not accepted");
	}
	System.out.println(l1);
}
}
