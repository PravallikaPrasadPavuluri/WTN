package com.wipro.ClassesandObjects;
class Calculator
{
	public static double powerInt(int num1, int num2)
	{
		double result;
		result = Math.pow(num1, num2);
		return result;
	}
	public static double powerDouble(int num1, int num2)
	{
		double result;
		result = Math.pow(num1, num2);
		return result;
	}
}
public class CalcClass {
public static void main(String[] args) {
	Calculator cal = new Calculator();
	System.out.println("This is powerInt block...");
	double final_result;
	final_result = cal.powerInt(12,2);
	System.out.println(final_result);
	System.out.println("This is powerDouble block...");
	double final_result1;
	final_result1 = cal.powerDouble(13,3);
	System.out.println(final_result1);
}
}
