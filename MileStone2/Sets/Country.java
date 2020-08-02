package com.wipro.Set;
import java.util.*;
public class Country {
	TreeSet<String> T1 = new TreeSet<String>();
	public TreeSet<String> saveCountryNames(String CountryName)
	{
		T1.add(CountryName);
		return T1;
	}
	public String getCountry(String name)
	{
		Iterator<String> i = T1.iterator();
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
