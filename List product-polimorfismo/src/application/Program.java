// Exercicio proposto de polimorfismo

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of Products:");
		int n = sc.nextInt();
		

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Product #" + i + " data:");
			System.out.println("Common, used or imported (c/u/i):");
			char ch = sc.next().charAt(0);
			if (ch == 'c') {
				System.out.print("Name:");
				String name = sc.next();
				System.out.print("Price:");
				double price = sc.nextDouble();
				list.add(new Product(name, price));
			}
			else if(ch == 'u') {
				sc.nextLine();
				System.out.print("Name:");
				String name = sc.nextLine();
				System.out.print("Price:");
				double price = sc.nextDouble();
				System.out.print("Manufacture Date (dd/MM/YYYY):");
				Date manufactureDate = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufactureDate));
			}
			else {
				sc.nextLine();
				System.out.print("Name:");
				String name = sc.nextLine();
				System.out.print("Price:");
				double price = sc.nextDouble();
				System.out.print("Customs Fee:");
				double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
			}
		
		}
		System.out.println("PRICE TAGS:");
		for(Product product : list) {
			System.out.println(product.priceTag());
		}
	}

}
