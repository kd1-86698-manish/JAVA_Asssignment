import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Two Values : ");

		if (sc.hasNextDouble()) {
			if (!sc.hasNextInt()) {
				double n1 = sc.nextDouble();
				double n2 = sc.nextDouble();
				System.out.println("Average :"+((n1+n2)/2));
			}
			else
			{
				System.err.println("Error Int value entered");
				System.exit(0);
			}
		}
		else
		{
			System.err.println("Error Char value entered");
			System.exit(0);
		}

	}

}
