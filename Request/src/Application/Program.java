
// Exercicio proposto do módulo de enumerações
package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import Entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		System.out.println("Enter Client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		
		System.out.print("E-mail: ");
		String email = sc.next();
		
		
		System.out.println("Birth Date (dd/MM/yyyy): ");
		Date bithDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, bithDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status:");
		OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), orderStatus, client);
		
		
		System.out.println("How many items to this order?");
		int n = sc.nextInt();
		
		
		
		for (int i=0;i<n;i++) {
			
			System.out.println("Enter #" + i+1 + " item data:");
			
			System.out.print("Product Name: ");
			String productName = sc.next();
			System.out.println();
			
			System.out.print("Product Price: ");
			Double productPrice = sc.nextDouble();
			System.out.println();
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			System.out.println();
			
			OrderItem item = new OrderItem(quantity, productPrice, product);
			order.addItem(item);
			
		}
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		
		sc.close();
	}

}
