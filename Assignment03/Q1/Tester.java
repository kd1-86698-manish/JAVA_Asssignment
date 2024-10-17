package com.manish;

public class Tester {

	public static void main(String[] args) {

		Invoice I1 = new Invoice();
		I1.accept();

		Invoice I2 = new Invoice();
		I2.accept();

		System.out.println("----------------------------------Invoice----------------------------------");
		System.out.println("Part_No\t\t" + "Part_Name\t" + "Quantity\t" + "Price\t\t" + "Total");
		I1.display();
		I2.display();
		System.out.println("---------------------------------------------------------------------------");
	}

}
