import java.util.Scanner;

public class Question02 {

	static Scanner sc = new Scanner(System.in);

	public static int menu() {

		System.out.println("------------Menu------------");
		System.out.println("1.Dosa       = 50 Rs.");
		System.out.println("2.Samosa     = 20 Rs.");
		System.out.println("3.Idli       = 35 Rs.");
		System.out.println("4.Vadapav    = 15 Rs.");
		System.out.println("5.Poha       = 25 Rs.");
		System.out.println("6.Upma       = 25 Rs.");
		System.out.println("7.Medu Vada  = 40 Rs.");
		System.out.println("8.Genrate Bill ");
		System.out.println("----------------------------");

		System.out.println("Enter Your Choice ::");
		int choice = sc.nextInt();

		return choice;
	}

	public static void main(String[] args) {
		int choice;
		double bill = 0;
		int qty;
		while ((choice = menu()) != 0) {
			switch (choice) {

			case 1: {
				System.out.println("Enter Quantity : ");
				qty = sc.nextInt();
				bill = bill + (qty * 50);
				break;
			}
			case 2: {
				System.out.println("Enter Quantity : ");
				qty = sc.nextInt();
				bill = bill + (qty * 20);
				break;
			}
			case 3: {
				System.out.println("Enter Quantity : ");
				qty = sc.nextInt();
				bill = bill + (qty * 35);
				break;
			}
			case 4: {
				System.out.println("Enter Quantity : ");
				qty = sc.nextInt();
				bill = bill + (qty * 15);
				break;
			}
			case 5: {
				System.out.println("Enter Quantity : ");
				qty = sc.nextInt();
				bill = bill + (qty * 25);
				break;
			}
			case 6: {
				System.out.println("Enter Quantity : ");
				qty = sc.nextInt();
				bill = bill + (qty * 25);
				break;
			}
			case 7: {
				System.out.println("Enter Quantity : ");
				qty = sc.nextInt();
				bill = bill + (qty * 25);
				break;
			}
			case 8: {
				System.out.println("---------------------------");
				System.out.println("Total Bill : " + bill);
				System.out.println("---------------------------");
				System.out.println("Thank You...Visit Again..:)");
				System.exit(8);

				break;
			}
			default: {
				System.out.println("Invalid Choice....:(");
				break;
			}
			}

		}

	}

}
