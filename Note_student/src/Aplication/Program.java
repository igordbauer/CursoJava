package Aplication;

import java.util.Scanner;

import Entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student estudante = new Student();      // nao esquecer de criar a variavel do tipo da classe que foi criada!!!!!!!!!!
		
		System.out.println("Name: ");
		estudante.name = sc.next();
		
		System.out.println("Nota 1: ");
		estudante.grade1 = sc.nextDouble();
		
		System.out.println("Nota 2: ");
		estudante.grade2 = sc.nextDouble();
		
		System.out.println("Nota 3: ");
		estudante.grade3 = sc.nextDouble();
		
		System.out.println(estudante);
		
		System.out.println("Resultado Final:");
		if (estudante.Avaliation() > 60) {
			System.out.printf("Final grade:%.2f\r\n",estudante.Avaliation());
			System.out.println("Pass!");
		}
		else {
			System.out.printf("Final grade:%.2f",estudante.Avaliation());
			System.out.println("Failed!");
			System.out.printf("Missing %.2f points",60.00-estudante.Avaliation());
		}
		sc.close();
	}

}
