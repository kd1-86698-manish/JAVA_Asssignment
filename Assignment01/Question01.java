import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Two Values : ");

		if (sc.hasNextDouble() && !sc.hasNextInt()) {

			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			System.out.println("Average :" + ((n1 + n2) / 2));
		}

		else {
			System.err.println("Error ");
			System.exit(0);
		}

	}

}
