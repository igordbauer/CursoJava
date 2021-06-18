import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Exe1: Fazer um programa para ler um número inteiro, e depois dizer se este
		// número é negativo ou não.

		// int numero;

		// numero = sc.nextInt();

		// if (numero < 0) {
		// System.out.println("Negativo");
		// }
		// else {
		// System.out.println("Não Negativo");
		// }

		// Exe1 fim

		// ------------------------------------------------------------------------

		// Exe2: Fazer um programa para ler um número inteiro e dizer se este número é
		// par ou ímpar.

		// int numero, impar_ou_nao;
		// numero = sc.nextInt();
		// impar_ou_nao = numero%2;

		// if (impar_ou_nao != 0) {
		// System.out.println("Ímpar");
		// }
		// else {
		// System.out.println("Par");
		// }
		// Exe2 Fim

		// ----------------------------------------------------------------------------------

		// Exe3: Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma
		// mensagem "Sao Multiplos" ou "Nao sao
		// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os
		// números devem poder ser digitados em
		// ordem crescente ou decrescente.

		// int A, B;
		// double multiplo;

		// A = sc.nextInt();
		// B = sc.nextInt();
		// if((A%B)==0 || (B%A) == 0) {
		// System.out.println("Múltiplo");
		// }
		// else {
		// System.out.println("Não Múltiplo");
		// }

		
		// Exe3 fim
		
		//----------------------------------------------------------------------------------
		
		//Exe4: Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		
		int total;
		int horario_inicial, horario_final;
		horario_inicial = sc.nextInt();
		horario_final = sc.nextInt();
		
		if( horario_inicial > horario_final ) {
			total = 24 - horario_inicial + horario_final;
		}
		else if(horario_inicial < horario_final){
			total = horario_final - horario_inicial;
		}
		else {
			total = 24;
		}
		
		System.out.println("O JOGO DUROU "+ total +" HORAS");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	
	}

}
