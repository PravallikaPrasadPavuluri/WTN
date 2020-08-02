package com.wipro.Set;
import java.util.*;
public class Task4 {
	public static void main(String[] args) {
		Country cd = new Country();
		cd.saveCountryNames("India");
		cd.saveCountryNames("Canada");
		cd.saveCountryNames("Germany");
		System.out.println(cd.getCountry("India"));
		System.out.println(cd.getCountry("Taiwan"));
	}
}
