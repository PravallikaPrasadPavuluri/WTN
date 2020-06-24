package com.wipro.Inheritance;

public class TestEmployee {
public static void main(String[] args) {
	Person person = new Person("Wipro");
	Employee employee = new Employee("Talent", 100,3,"123");
	System.out.println(person.name);
	System.out.println(employee.name);
	System.out.println(employee.annualSalary);
	System.out.println(employee.yearOfJoining);
	System.out.println(employee.natInsNum);
}
}
