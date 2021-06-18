package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		System.out.println("Enter the retangle width and height:");
		retangulo.height = sc.nextDouble();
		retangulo.width = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n",retangulo.area());
		System.out.printf("Perimeter: %.2f%n",retangulo.perimeter());
		System.out.printf("Diagonal: %.2f%n",retangulo.diagonal());
		
		
		
		
		
		
		
		
		sc.close();

	}

}
