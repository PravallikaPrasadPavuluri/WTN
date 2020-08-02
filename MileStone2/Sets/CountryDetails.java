package com.wipro.Set;
import java.util.*;
public class CountryDetails {
HashSet<String> H1 = new HashSet<String>();
public HashSet<String> saveCountryNames(String CountryName)
{
	H1.add(CountryName);
	return H1;
}
public String getCountry(String name)
{
	Iterator<String> i = H1.iterator();
	while(i.hasNext())
	{
		if(i.next().equals(name))
		{
			return name;
		}
	}
	return null;
}
}
