package com.app.fruits;

import java.util.Scanner;

public class Apple extends Fruit {

	String taste = "Sweet n Sour";

	public Apple() {
		super("Apple");
	}

	@Override
	public String taste() {
		return taste;
	}

	@Override
	public void accept(Scanner sc) {

		System.out.print("Enter Color of Apple :");
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
