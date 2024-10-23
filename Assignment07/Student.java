package com.manish;

import java.util.Scanner;

public class Student implements Comparable<Student> {

	private int rollno;
	private String name;
	private double marks;
	private String city;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student() {
	}

	public Student(int rollno, String name, double marks, String city) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.city = city;
	}

	public void accept(Scanner sc) {
		System.out.print("Enter Roll No :");
		rollno = sc.nextInt();

		System.out.print("Enter Name :");
		name = sc.next();

		System.out.print("Enter Marks :");
		marks = sc.nextDouble();

		System.out.print("Enter City :");
		city = sc.next();
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", city=" + city + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.rollno - o.rollno;
	}

}
