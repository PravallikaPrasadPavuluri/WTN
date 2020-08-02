package com.wipro.collections;
import java.util.*;
public class Employee {
int empId;
String empName;
String email;
float salary;
public Employee(int empId, String empName, String email, float salary)
{
	this.empId = empId;
	this.empName = empName;
	this.email = email;
	this.salary = salary;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public void GetEmployeeDetails()
{
	System.out.println(empId + " " + empName + " " + email + " " + salary);
}
}
