package com.wipro.collections;
import java.util.*;
class Employe
{
	int emp_id;
	String emp_name;
	Double sal;
	public Employe(int emp_id, String emp_name, Double sal)
	{
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.sal = sal;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public String toString()
	{
		return "id=" + emp_id + ", name=" + emp_name + ", salary=" + sal;
	}
}
public class Task7 {
public static void main(String[] args) {
Vector<Employe> v = new Vector<>();
v.add(new Employe(1006, "Puppy",300.00));
v.add(new Employe(1007, "Pappu",400.00));
v.add(new Employe(1008, "Pinky",500.00));
Iterator<Employe> i = v.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
}
}
