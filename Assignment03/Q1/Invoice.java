package com.manish;

import java.util.Scanner;

public class Invoice {

	Scanner sc = new Scanner(System.in);

	String partNo;
	String partName;
	int qty;
	double price;

	public Invoice() {
		this("1", "ABC", 1, 1);
	}

	public Invoice(String partNo, String partName, int qty, double price) {
		this.partNo = partNo;
		this.partName = partName;
		this.qty = qty;
		this.price = price;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void accept() {
		System.out.println("Enter PartNO : ");
		partNo = sc.next();

		System.out.println("Enter Part Name : ");
		partName = sc.next();

		System.out.println("Enter Quantity : ");
		qty = sc.nextInt();
		if (getQty() < 0) {
			setQty(0);
		} else {
			setQty(qty);
		}

		System.out.println("Enter Price : ");
		price = sc.nextInt();
		if (getPrice() < 0) {
			setPrice(0);
		} else {
			setPrice(price);
		}
	}

	public void display() {

		System.out.println(partNo + "\t\t" + partName + "\t\t" + qty + "\t\t" + price + "\t\t" + totalPrice());

	}

	public double totalPrice() {
		double amt;
		amt = qty * price;
		return amt;
	}
}
