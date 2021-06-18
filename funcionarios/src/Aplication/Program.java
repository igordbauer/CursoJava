package Aplication;

import java.util.Scanner;

import Entities.employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		employee funcionario = new employee();
		System.out.println("Nome do funcionario: ");
		funcionario.name = sc.nextLine();
		System.out.println("Salario: ");
		funcionario.gloss_salary = sc.nextDouble();
		System.out.println("Taxas: ");
	
		funcionario.tax = sc.nextDouble();
		funcionario.Netsalary();
		System.out.println(funcionario);
		System.out.println();
		System.out.println("Which percentage to inclrease salary: ");
		double percentage = sc.nextDouble();
		funcionario.Increase_salary(percentage);
		System.out.println("Updated Data:");
		System.out.println(funcionario);
		
		sc.close();
	}

}
