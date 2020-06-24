package com.wipro.Inheritance;

public class Employee extends Person {
double annualSalary;
int yearOfJoining;
String natInsNum;
public Employee(String name, double annualSalary, int yearOfJoining,String natInsNum)
{
	super(name);
	this.annualSalary = annualSalary;
	this.yearOfJoining = yearOfJoining;
	this.natInsNum = natInsNum;
}
public void setannualSalary(double annualSalary)
{
	this.annualSalary = annualSalary;
}
public void setyearOfJoining(int yearOfJoining)
{
	this.yearOfJoining = yearOfJoining;
}
public void setnatInsNum(String natInsNum)
{
	this.natInsNum = natInsNum;
}
public double getannualSalary()
{
	return annualSalary;
}
public int getyearOfJoining()
{
	return yearOfJoining;
}
public String setnatInsNum()
{
	return natInsNum;
}
}
