package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();

		System.out.println("Enter account holder: ");
		String accountName = sc.next();
		System.out.println("Is thre an initial deposit (y/n)?");
		char answer = sc.next().charAt(0);
		double balance = 0.0;
		if (answer == 'y' || answer == 'Y') {
			System.out.println("Enter initial deposit value: ");
			balance = sc.nextDouble();
		}
 		Account Account = new Account(accountNumber, accountName, balance);
		System.out.println("Account data: ");
		System.out.println(Account);

		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();

		Account.depositValue(deposit);
		System.out.println("Updated account data: ");
		System.out.println(Account);

		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		Account.withdraw(withdraw);

		System.out.println("Updated account data: ");
		System.out.println(Account);
		sc.close();
	}

}
