package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter pruduct data:");
		System.out.print("Name: ");																// toda classe em java é uma subclasse da classe Object
		product.name = sc.nextLine();
		
		System.out.print("Price:");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity:");
		product.quantity = sc.nextInt();
		
		System.out.println("Product data: "+ product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity_add = sc.nextInt();			// entra a quantidade de produtos a serem adicionados
		product.addProducts(quantity_add);			// chama o método que adiciona produtos
		System.out.println();
		
		System.out.print("Updated data: "+ product);
		System.out.println();
		
		
		System.out.print("Enter the number of products to be removed from stock: ");
		int quantity_remove = sc.nextInt();
		product.removeProducts(quantity_remove);
		System.out.println();
		
		System.out.print("Updated data: "+ product);
		System.out.println();
		sc.close();
	}

}
