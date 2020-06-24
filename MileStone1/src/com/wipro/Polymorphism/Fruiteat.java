package com.wipro.Polymorphism;
class fruit
{
	String name;
	String taste;
	String size;
	fruit(String n, String t, String s)
	{
		name = n;
		taste = t;
		size = s;
	}
	void eat()
	{
		System.out.println(name);
		System.out.println(taste);
	}
}
class Apple extends fruit
{
	Apple(String n, String t, String s)
	{
		super(n,t,s);
	}
	void eat()
	{
		System.out.println(name);
		System.out.println(taste);
	}
}
class Orange extends fruit
{
	Orange(String n, String t, String s)
	{
		super(n,t,s);
	}
	void eat()
	{
		System.out.println(name);
		System.out.println(taste);
	}
}
public class Fruiteat {
	public static void main(String[] args) {
Apple apple = new Apple("Apple", "sweet","round");
Orange orang = new Orange("Orange", "sour","round");
apple.eat();
orang.eat();
	}
}
