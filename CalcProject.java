import java.util.Scanner;

public class CalcProject {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double temp = 0;
		double a = 0;
		double b = 0;
		char ch1 = 'n';

		do {
			if (ch1 == 'n') {
				System.out.print("\033[H\033[2J");
				System.out.flush();
				System.out.println("Enter to the calculator function");
				System.out.println("1st number ::");
				a = sc.nextFloat();
				temp = a;
			}

			System.out.println("Select operation to be performed");
			System.out.println("Addition-a: Subtraction-s: Multiplication-m: Division-d: ");
			char ch = sc.next().charAt(0);

			System.out.println("2nd number ::");
			b = sc.nextFloat();

			switch (ch) {
			case 'a':
				temp = temp + b;
				System.out.println("Sum of the given two numbers: " + temp);
				break;
			case 's':
				temp = temp - b;
				System.out.println("Difference between the two numbers: " + temp);
				break;
			case 'm':
				temp = temp * b;
				System.out.println("Product of the two numbers: " + temp);
			case 'd':

				if (b == 0) {
					System.out.println("Invalid Operation: Division by 0");
					break;
				}
				temp = temp / b;
				System.out.println("Result of the division: " + temp);
				break;
			default:
				System.out.println("Invalid operator,2nd value ignored");
			}

			System.out.println("Do you want to retain the value for next operation");
			System.out.println("y: Yes, n: No ");
			ch1 = sc.next().charAt(0);
		} while (true);
	}
}