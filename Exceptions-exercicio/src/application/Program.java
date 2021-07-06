package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		try {
		System.out.println("Enter Account data:");
		
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Initial balance: ");
		double initBalance = sc.nextDouble();
		
		System.out.print("Withdraw Limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, initBalance, withdrawLimit);
		
		System.out.print("Enter amount for withdraw: ");
 		acc.withDraw(sc.nextDouble());
		
 		System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
		}
		catch(InputMismatchException e) {
			System.out.println("Error!");
		}
		catch(DomainException e) {
			System.out.println("Error! " + e.getMessage());
		}
		sc.close();
	}

}
