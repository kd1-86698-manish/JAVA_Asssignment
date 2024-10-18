package com.sunbeam;

import java.util.Scanner;

public class Employee {

	Scanner sc = new Scanner(System.in);

	String fname;
	String lname;
	double salary;

	public Employee() {
		this("FNAME", "LNAME", 0.0);
	}

	public Employee(String fname, String lname, double salary) {

		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void acceptEmp() {

		System.out.println("Enter First Name :");
		fname = sc.next();

		System.out.println("Enter Last Name :");
		lname = sc.next();

		System.out.println("Enter Monthly Salary :");
		salary = sc.nextInt();
		if (getSalary() < 0) {
			setSalary(0);
		}
	}

	public void displayEmp() {

		System.out.println("Name : " + fname + " " + lname);

	}

}
