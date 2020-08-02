package com.wipro.Set;
import java.util.*;
public class Task3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	TreeSet<String> ts = new TreeSet<String>();
	ts.add("KLU");
	ts.add("Wipro");
	ts.add("Java");
	ts.add("Collections");
	Iterator<String> i = ts.iterator();
	System.out.println(ts.descendingSet());
	while(i.hasNext())
	{
		System.out.println(i.next());
	}	
	System.out.print("Enter a name to check in the set: ");
	String str = sc.nextLine();
	boolean b = false;
	while(i.hasNext())
	{
		if(i.next().equals(str))
		{
			b = true;
			break;
		}
	}
		if(b)
		{
			System.out.println("The given name exists");
		}
		else
		{
			System.out.println("The given name doesnot exist");
	}
}
}
