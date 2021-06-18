package Aplication;

import java.util.Scanner;

import Entities.Room;

public class Program {

	public static void main(String[] args) {
		Scanner sc  =  new Scanner ( System.in);
		Room[] vect = new Room[10];
		System.out.println("Hoe many rents will be rented?");
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			System.out.printf("Rent #%d%n",i+1);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[room] = new Room(name,email); 
		}
		System.out.println("Busy rooms:");
		for(int k=0;k<10;k++) {
			if(vect[k] != null) {
				System.out.printf(k + ": " + vect[k] +"\r\n");
			}
		}
		sc.close();
	}

}
