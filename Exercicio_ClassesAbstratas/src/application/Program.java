package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.CompanyAccount;
import entities.IndividualAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		List<Account> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i=1;i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or Company (i/c)?");
			
			char ch = sc.next().charAt(0);
			
			if (ch == 'i') {
				System.out.println();
				System.out.print("Name: ");
				String name = sc.nextLine();
				sc.nextLine();
				System.out.print("Anual Income: ");
				double income = sc.nextDouble();
				System.out.print("Health Expenditures: ");
				double health = sc.nextDouble();
				list.add(new IndividualAccount(name, income, health));
			}
			else {
				System.out.println();
				System.out.print("Name: ");
				String name = sc.nextLine();
				sc.nextLine();
				System.out.print("Anual Income: ");
				double income = sc.nextDouble();
				System.out.print("Number of employees: ");
				int employees  = sc.nextInt();
				list.add(new CompanyAccount(name, income, employees));
			}
		}
		int sum =0;
		for(Account acc: list) {
			
			System.out.println(String.format("%.2f",acc.getTribute()));
			sum +=acc.getTribute(); 
		}
		System.out.printf("Total taxes: %.2f", sum);
		sc.close();
	}

}
