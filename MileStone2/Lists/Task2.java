package com.wipro.collections;
import java.util.*;
public class Task2 {
public static void main(String[] args) {
EmployeeDB edb = new EmployeeDB();
Employee e1 = new Employee(1001, "A", "afdf@gmail.com", 23.00F);
Employee e2 = new Employee(1002, "B", "puppy@gmail.com", 45.00F);
Employee e3 = new Employee(1003, "C", "pinky@gmail.com", 343.00F);
edb.addEmployee(e1);
edb.addEmployee(e2);
edb.addEmployee(e3);

for (Employee p : edb.Display())
	p.GetEmployeeDetails();

System.out.println();
}
}
