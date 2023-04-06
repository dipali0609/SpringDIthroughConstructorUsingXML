package com.edu;

public class Employee {
private String ename;
private int eage;
private float esalary;
public Employee(String ename, int eage, float esalary) {
	super();
	this.ename = ename;
	this.eage = eage;
	this.esalary = esalary;
}

public void display()
{
	System.out.println("Name:"+ename);
	System.out.println("Age:"+eage);
	System.out.println("Salary:"+esalary);
	
	
}
}
