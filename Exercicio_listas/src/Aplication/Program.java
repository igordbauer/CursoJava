package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Employee: #%d%n", i + 1);
			
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);

			list.add(emp);
		}
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		
		//Employee emp = list.stream().filter(x -> x.getid() == idsalary).findFirst().orElse(null);
		Integer pos = Position(list, idsalary);

		if (pos == null) {
			System.out.println("This id do not exist!");
		} 
		else {
			System.out.println("Enter the percentage to increase:");
			Double percentage = sc.nextDouble();
			list.get(pos).IncreaseSalary(percentage);
		}
		sc.nextLine();
		
		System.out.println("List of employees:");
		
		for (Employee emp : list) {
			System.out.println(emp);
		}
		sc.close();
	}

	public static Integer Position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
