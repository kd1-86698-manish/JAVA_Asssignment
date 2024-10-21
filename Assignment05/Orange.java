package com.app.fruits;

import java.util.Scanner;

public class Orange extends Fruit {

	String taste = "Sour";

	public Orange() {
		super("Orange");
	}

	@Override
	public String taste() {
		return taste;
	}

	@Override
	public void accept(Scanner sc) {

		System.out.print("Enter Color of Orange :");
		color = sc.next();

		System.out.print("Enter Weight : ");
		weight = sc.nextDouble();

	}

	@Override
	public void display() {

		System.out.println("Color : " + color);
		System.out.println("Weight : " + weight);
	}

}
