package com.manish.q2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		String str;
		String rev = "";

		System.out.println("Enter String : ");
		str = new Scanner(System.in).next();

		for (int i = 0; i < str.length(); i++) {

			rev = str.charAt(i) + rev;
		}

		System.out.println("Reverse String : " + rev);
	}

}
