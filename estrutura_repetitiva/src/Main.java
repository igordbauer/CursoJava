import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// int valor, soma = 0;
		// valor = sc.nextInt();
		// while (valor != 0) {
		// valor = sc.nextInt();
		// soma += valor;
		// }
		// System.out.println(soma);
		// sc.close();

		int i, N = 0;
		int soma = 0;
		N = sc.nextInt();
		for (i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		System.out.println(soma);
 	}

}
