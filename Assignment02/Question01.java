import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number : ");
		int num = sc.nextInt();

		System.out.println("Given Number :: " + num);

		System.out.println("Binary Equivalent :: " + Integer.toBinaryString(num));

		System.out.println("Octal Equivalent :: " + Integer.toOctalString(num));

		System.out.println("Hexadecimal Equivalent :: " + Integer.toHexString(num));

	}

}
