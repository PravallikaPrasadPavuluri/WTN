package com.wipro.Polymorphism;
class shape{
	void draw()
	{
		System.out.println("Drwaing shape");
	}
	void erase()
	{
		System.out.println("Erasing shape");
	}
}
class Circle extends shape
{
	void draw()
	{
		System.out.println("Drwaing circle");
	}
	void erase()
	{
		System.out.println("Erasing circle");
	}
}
class Triangle extends shape
{
	void draw()
	{
		System.out.println("Drwaing triangle");
	}
	void erase()
	{
		System.out.println("Erasing triangle");
	}
}
class Square extends shape
{
	void draw()
	{
		System.out.println("Drwaing square");
	}
	void erase()
	{
		System.out.println("Erasing square");
	}
}
public class Polym {
public static void main(String[] args) {
	Circle c = new Circle();
	c.draw();
	shape sh = new Circle();
	sh.draw();
	shape sh1 = new Triangle();
	sh.draw();
	shape sh2 = new Square();
	sh.draw();
}
}
