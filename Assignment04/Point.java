package com.sunbeam;

import java.util.Scanner;

public class Point {

	Scanner sc = new Scanner(System.in);
	int x;
	int y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getDetails() {
		return "Point [" + x + ", " + y + "]";
	}

	public void accept() {

		System.out.println("Enter Point Co-ordinates ");

		System.out.println("x : ");
		x = sc.nextInt();

		System.out.println("y : ");
		y = sc.nextInt();
	}

	public boolean isEquals(Point p2) {
		if (this.x == p2.x && this.y == p2.y) {
			return true;
		}
		return false;

	}

	public void calculateDistance(Point p2) {

		double distance = Math.sqrt((Math.pow(this.x - p2.x, 2)) + Math.pow(this.y - p2.y, 2));

		System.out.printf("Distance - %.2f", distance);
	}
}
