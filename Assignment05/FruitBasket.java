package com.app.fruits;

import java.util.Iterator;
import java.util.Scanner;

public class FruitBasket {

	public static int menu(Scanner sc) {

		System.out.println("---------------Menu---------------");
		System.out.println("0.Exit");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display All Fruits in Basket");
		System.out.println("5.Display Name/color/weight/taste all fresh fruits in Basket");
		System.out.println("6.Display taste of all Stale Fruits in Basket");
		System.out.println("7.Mark Fruit as Stale");
		System.out.println("8.Mark All Sour Fruits Stale");
		System.out.println("----------------------------------");

		System.out.print("Enter Your Choice : ");
		return sc.nextInt();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Fruit[] arr = new Fruit[3];

		int choice;
		int index = 0;

		while ((choice = menu(sc)) != 0) {

			switch (choice) {
			case 1: {
				if (index < 3) {
					arr[index] = new Mango();
					arr[index].accept(sc);
					index++;
				} else {
					System.out.println("Basket is Full");
				}

			}
				break;
			case 2: {
				if (index < 3) {
					arr[index] = new Orange();
					arr[index].accept(sc);
					index++;
				} else {
					System.out.println("Basket is Full");
				}

			}
				break;
			case 3: {
				if (index < 3) {
					arr[index] = new Apple();
					arr[index].accept(sc);
					index++;
				} else {
					System.out.println("Basket is Full");
				}

			}
				break;
			case 4: {
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null)
						System.out.println(arr[i].getName());
				}

			}
				break;
			case 5: {
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null && arr[i].isFresh()) {

						System.out.println(arr[i].toString());
						System.out.println("Taste : " + arr[i].taste());
						System.out.println("Fresh : " + arr[i].isFresh());
					}
				}

			}
				break;
			case 6: {
				for (int i = 0; i < arr.length; i++) {
					if (!arr[i].isFresh()) {
						System.out.println("\nFruit : " + arr[i].getName());
						System.out.println("Taste : " + arr[i].taste());
					}
				}

			}
				break;

			case 7: {
				System.out.println("Enter index to mark stale :: ");
				int idx = sc.nextInt();

				if (idx <= index && idx > -1) {
					arr[idx].setFresh(false);
				} else {
					System.out.println("Index not Found...");
				}

			}

				break;
			case 8: {
				for (int i = 0; i < arr.length; i++) {

					if (arr[i].taste().equals("Sour")) {
						arr[i].setFresh(false);
					}

				}

			}
				break;

			default:
				System.out.println("Invalid Choice....");
				break;
			}

		}
		System.out.println("Thank You.....:)");

	}

}
