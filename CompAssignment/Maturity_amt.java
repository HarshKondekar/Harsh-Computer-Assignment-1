package CompAssignment;
import java.util.Scanner;
class Maturity_amt
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Menu");
	System.out.println("1. Term Deposit");
	System.out.println("2. Recurring Deposit");
	System.out.print("Enter your choice: ");
	int choice = sc.nextInt();
	switch (choice)
	{
		case 1:
			System.out.print("Enter principal: ");
			int P1 = sc.nextInt();
			System.out.print("Enter rate of interest: ");
			int r1 = sc.nextInt();
			System.out.print("Enter period in years: ");
			int n1 = sc.nextInt();
			double maturityAmount1 = P1 * Math.pow(1 + r1 / 100.0, n1);
			System.out.println("Maturity Amount is " + maturityAmount1);
			break;
		case 2:
			System.out.print("Enter monthly installment: ");
			int P2 = sc.nextInt();
			System.out.print("Enter rate of interest: ");
			int r2 = sc.nextInt();
			System.out.print("Enter period in months: ");
			int n2 = sc.nextInt();
			double maturityAmount2 = P2 * n2 + P2 * (n2 * (n2 + 1) / 2.0) * (r2 / 100.0) * (1.0 / 12);
			System.out.println("Maturity Amount is " + maturityAmount2);
			break;
		default:
			System.out.println("Invalid choice");
	}
}
}
