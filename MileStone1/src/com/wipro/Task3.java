package com.wipro.collections;
import java.util.*;
public class Task3 {
public static void main(String[] args) {
	List<String> l1 = new ArrayList<String>();
	l1.add("KLU");
	l1.add("KLEF");
	l1.add("KLCE");
	printall(l1);
}
	public static void printall(List<String> l1)
	{
	Iterator<String> i = l1.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	}

}
