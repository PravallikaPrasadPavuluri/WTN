package com.wipro.collections;
import java.util.*;
public class EmployeeDB {
List<Employee> l = new ArrayList<Employee>();
public boolean addEmployee(Employee e)
{
	return l.add(e);
}
public boolean deleteEmployee(int empId)
{
	boolean b = false;
	Iterator<Employee> i = l.iterator();
	while(i.hasNext())
	{
		if(i.next().getEmpId() == empId)
		{
			b = true;
			i.remove();
		}
	}
	return b;
}
public String showPaySlip(int empId)
{
	String str = " ";
	for(Employee e : l)
	{
		if(e.getEmpId() == empId)
		{
			str = empId + "  and salary is" + e.getSalary();
		}
	}
	return str;
}
public Employee[] Display()
{
	Employee[] p = new Employee[l.size()];
	int i;
	for(i = 0 ; i < l.size() ; i ++)
	{
		p[i] = l.get(i);
	}
	return p;
}
}
