package com.wipro.Abstraction;
import java.util.*;
abstract class Compartment
{
	public abstract String notice();
}
class Firstclass extends Compartment
{
	public String notice()
	{
		String s1 = "This is the Firstclass in the Compartment";
		return s1;
	}
	
}
class Ladies extends Compartment
{
	public String notice()
	{
		String s2 = "This is the Ladies Compartment";
		return s2;
	}
}
class General extends Compartment
{
	public String notice()
	{
		String s3 = "This is the General Compartment";
		return s3;
	}
}
class Luggage extends Compartment
{
	public String notice()
	{
		String s4 = "This is for luggages";
		return s4;
	}
}
public class TestCompartment {
public static void main(String[] args) {
	Compartment compartment[] = new Compartment[10];
	Random ran = new Random();
	int number = 0;
	int inc;
	for(inc = 0 ; inc < 10 ; inc ++)
	{
		number = ran.nextInt(4);
		if(number == 0)
		compartment[inc] = new Firstclass();
		else if(number == 1)
			compartment[inc] = new General();
		else if(number == 2)
			compartment[inc] = new Luggage();
		else if(number == 3)
			compartment[inc] = new Ladies();
		compartment[inc].notice();
		System.out.println( );
	}
}
}
