package com.wipro.Inheritance;
class Animal
{
void eat()
{
	System.out.println("Animal class - Eating Method");
}
void sleep()
{
	System.out.println("Animal class - Sleep Method");
}
}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("Bird class - Eating Method");
	}
	void sleep()
	{
		System.out.println("Bird class - Sleep Method");
	}
	void fly()
	{
		System.out.println("Bird class - Fly Method");
	}
}
public class Inherit {
public static void main(String[] args) {
	Animal animal = new Animal();
	Bird bird = new Bird();
	animal.eat();
	animal.sleep();
	bird.eat();
	bird.sleep();
	bird.fly();
}
}
