package com.manish;

import java.util.Scanner;

public class InputString {

	String str;

	public InputString() {
		// TODO Auto-generated constructor stub
	}

	public InputString(String str) {
		this.str = str;
	}

	public void accept(Scanner sc) {

		System.out.println("Enter String : ");
		str = sc.nextLine();
		if (str.length() > 80)
			throw new ExceptionLineTooLong("String length is too long...");
	}

	@Override
	public String toString() {
		return "String [str=" + str + "]";
	}

}
