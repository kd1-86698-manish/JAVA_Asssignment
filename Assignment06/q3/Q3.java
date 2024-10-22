package com.manish.q3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str;
		String rev = "";

		System.out.println("Enter String : ");
		str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}

		if (str.equals(rev)) {
			System.out.println(str + " is Pallindrome....");
		} else
			System.out.println(str + " is Not Pallindrome....");
	}

}
