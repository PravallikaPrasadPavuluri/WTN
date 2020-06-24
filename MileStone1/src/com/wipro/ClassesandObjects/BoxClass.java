package com.wipro.ClassesandObjects;
class Box
{
	double width;
	double height;
	double depth;
	Box()
	{
		width = 29.9;
		height = 30.1;
		depth = 18;
	}
	public double volume()
	{
		return width * height * depth;
	}
}
public class BoxClass {
	public static void main(String[] args) {	
Box b = new Box();
System.out.print("The volume of the box is :" + b.volume());
}
}
