package com.sunbeam;

public class Tester {

	public static void main(String[] args) {

		double hike;

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.acceptEmp();
		System.out.println();
		e2.acceptEmp();

		e1.displayEmp();
		e1.salary = e1.getSalary() * 12;
		System.out.println("Yearly Salary : " + e1.getSalary());
		e1.salary = e1.getSalary() + (e1.getSalary() * 0.10);
		System.out.println("10% Raise Salary : " + e1.getSalary());

		System.out.println("\n");

		e2.displayEmp();
		e2.salary = e2.getSalary() * 12;
		System.out.println("Yearly Salary : " + e2.getSalary());
		e2.salary = e2.getSalary() + (e2.getSalary() * 0.10);
		System.out.println("10% Raise Salary : " + e2.getSalary());
	}

}
