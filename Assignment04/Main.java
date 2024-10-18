package com.sunbeam;

public class Main {

	public static void main(String[] args) {

		Point p1 = new Point();
		Point p2 = new Point();

		p1.accept();
		p2.accept();

		if (p1.isEquals(p2)) {
			System.out.println("Points are Same..");
		} else {
			p1.calculateDistance(p2);
		}

	}

}
