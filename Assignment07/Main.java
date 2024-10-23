package com.manish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class StudNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class StudCityComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getCity().compareTo(o2.getCity());
	}
}

class StudMarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return -Double.compare(o1.getMarks(), o2.getMarks());
	}
}

public class Main {

	public static int menu(Scanner sc) {

		System.out.println("--------------Menu--------------");
		System.out.println("0.Exit");
		System.out.println("1.Add Student");
		System.out.println("2.Display Student");
		System.out.println("3.Sort Student On Roll No");
		System.out.println("4.Sort Student On Name");
		System.out.println("5.Sort Student On Marks");
		System.out.println("6.Sort Student On City");
		System.out.println("----------------------------");

		System.out.print("Enter Your Choice :: ");
		return sc.nextInt();

	}

	public static void display(Student[] arr) {

		for (Student stud : arr) {
			System.out.println(stud);
		}
		System.out.println();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		int index = 0;
		Student[] arr = new Student[3];

		while ((choice = menu(sc)) != 0) {

			switch (choice) {
			case 1: {
				if (index < 3) {
					arr[index] = new Student();
					arr[index].accept(sc);
					index++;
				} else
					System.out.println("Array is Full...");

			}
				break;
			case 2: {
				display(arr);
			}
				break;
			case 3: {
				Arrays.sort(arr);
				display(arr);
			}
				break;
			case 4: {
				Arrays.sort(arr, new StudNameComparator());
				display(arr);
			}
				break;
			case 5: {
				Arrays.sort(arr, new StudMarksComparator());
				display(arr);
			}
				break;
			case 6: {
				Arrays.sort(arr, new StudCityComparator());
				display(arr);
			}
				break;

			default:
				System.out.println("Invalid Choice..");
				break;
			}
		}

		System.out.println("Thank You....");
	}

}
