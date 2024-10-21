package com.app.fruits;

import java.util.Scanner;

public abstract class Fruit {

	String color;
	double weight;
	String name;
	boolean isFresh = true;

	public Fruit() {
	}

	public Fruit(String name) {
		this.name = name;
	}

	public Fruit(String color, double weight, String name, boolean isFresh) {

		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "\n[name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}

	public abstract String taste();

	public abstract void accept(Scanner sc);

	public abstract void display();

}
