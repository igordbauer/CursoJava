import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=0, B=0;
		System.out.println("Número em base 10: ");
		A = sc.nextInt();		// numero em base 10
		System.out.println("Numero da base desejada: ");
		B = sc.nextInt();		// base que eu quero
		
		while (A/B != 0 ) {
			System.out.println("valor inteiro da divisão é "+ A/B);
			System.out.println("resto da divisão " + A%B);
			A=A/B;
		}
		System.out.println("valor inteiro da divisão é "+ A/B);
		System.out.println("resto da divisão " + A%B);
	}

}
