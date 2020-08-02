package com.wipro.Set;
public class Task1 {
public static void main(String[] args) {
	CountryDetails cd = new CountryDetails();
	cd.saveCountryNames("India");
	cd.saveCountryNames("Canada");
	cd.saveCountryNames("Germany");
	System.out.println(cd.getCountry("India"));
	System.out.println(cd.getCountry("Taiwan"));
}
}
