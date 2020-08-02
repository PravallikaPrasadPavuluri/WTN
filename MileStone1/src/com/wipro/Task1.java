package com.wipro.collections;
import java.util.*;
public class Task1 {
public static void main(String[] args) {
	List<String> l1 = new ArrayList<String>();
	l1.add("January");
	l1.add("February");
	l1.add("March");
	l1.add("April");
	l1.add("May");
	l1.add("June");
	l1.add("July");
	l1.add("August");
	l1.add("September");
	l1.add("October");
	l1.add("November");
	l1.add("December");
	Iterator<String> i = l1.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
