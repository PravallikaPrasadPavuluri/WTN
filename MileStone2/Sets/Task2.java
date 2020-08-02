package com.wipro.Set;
import java.util.*;
public class Task2 {
public static void main(String[] args) {
	HashSet<String> hs = new HashSet<String>();
	hs.add("Puppy");
	hs.add("Pappu");
	hs.add("Pinky");
	hs.add("Pravallika");
	Iterator<String> i = hs.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
