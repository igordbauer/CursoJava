import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// String nome = "Maria";
		// int idade = 31;
		// double renda = 4000.0;
		// int y = 32;
		// double x = 32.6755;
		// System.out.println(y); // printa com quebra de linha
		// System.out.println(x);
		// System.out.printf("%.2f%n",x); // utilização de formatação de de variavel
		// tipo double com 2 casa depois da virgula
		// System.out.printf("%.4f%n",x);
		// Locale.setDefault(Locale.US); // comando que seta a localiazaçao da
		// aplicação, nesse caso utilizando sistema dos estados unidos
		// System.out.printf("%.4f%n",x);
		// System.out.println("RESULTADO = " + x + " metros."); // concatenação de
		// variaveis e texto
		// System.out.printf("Resultado= %.2f metros%n", x);
		// System.out.printf("%s tem %d anos e ganha R$ %.5f
		// reais.%n",nome,idade,renda);
		// Exercicio de fixação //
		// String product1 = "Computer";
		// String product2 = "Office desk";

		// int age = 30;
		// int code = 5290;
		// char gender = 'F';

		// double price1 = 2100.0;
		// double price2 = 650.50;
		// double measure = 53.234567;

		// System.out.printf("Products:\n");
		// System.out.printf("%s, which price is $ %.2f\n",product1,price1);
		// System.out.printf("%s, which price is $ %.2f\n",product2,price2);
		// System.out.printf("\n");
		// System.out.printf("Record: %d years old, code %d and gender:
		// %c\n",age,code,gender);
		// System.out.printf("\n");
		// System.out.printf("Measure with eight decimal places:%.8f\n",measure);
		// System.out.printf("Rounded (three decimal places): %.3f\n",measure);
		// Locale.setDefault(Locale.US);
		// System.out.printf("Us decimal point: %.3f\n",measure);
		// Fim do exercicio //
		// utilizando ferramenta de scanner//
		// Locale.setDefault(Locale.US);
		// Scanner sc = new Scanner(System.in); // atribuição da variável tipo scanner
		// String x;
		// x = sc.next(); // recebe string
		// int x;
		// x = sc.nextInt(); // recebe numero inteiro
		// double x;
		// x = sc.nextDouble(); // recebe numero de ponto flutuante
		// char x;
		// String x;
		// int y;
		// double z;
		// x = sc.nextLine();
		// y = sc.nextInt();
		// z = sc.nextDouble();
		// x = sc.next().charAt(0); // recebe um caractere
		// System.out.println("Você digitou");
		// System.out.println(x);
		// System.out.println(y);
		// System.out.println(z);

		// sc.close();
		// Scanner sc = new Scanner(System.in);
		// int x;
		// System.out.println("Qual hora?");
		// x = sc.nextInt();

		// if (x < 12) {
		// System.out.println("Boa Dia!");
		// }
		// else if (x < 18 && x >= 12) {
		// System.out.println("Boa tarde!");
		// }
		// else {
		// System.out.println("Boa Noite!");
		// }
		Scanner sc = new Scanner(System.in);
		
		
		//int x;
		//String dia;
		//x = sc.nextInt();
		//
		//switch(x) {
		//	case 1:
		//		dia = "Domingo";
		//		break;
		////		dia = "segunda";
		//	default:
		//		dia = "Outro";
			
		//}
		//System.out.println("Dia é " + dia);
		//int minutos; 
		//double tarifa, minutos_excedentes;
		//minutos = sc.nextInt();
		
		
		//if (minutos <= 100) {
		//	tarifa = 50.00;
		//}
		//else {
		//	minutos_excedentes = (double)(minutos - 100);
		//	tarifa = minutos_excedentes*2.00 + 50.00;
		//}
		//System.out.printf("Valor a pagar: R$%.2f", tarifa);
		
		//-------------------------------------------------------------------------
		
		
		// Expressão condicional ternária
		
		
		//int valor;
		//valor = sc.nextInt();
		//String sinal;
		
		//sinal = (valor > 0) ? "positivo" : "negativo";
		
		//System.out.println(sinal);
		
		//String original= "ABCDEF abcdef rr  ff  f ";
		//String s1 = original.toUpperCase();
		//String s2 = original.substring(2,9);
		//String s3 = original.replace("a","9");
		//String s4 = s3.replace("A","9");
		//System.out.println(s1);
		
		//System.out.println(s4);
		
		//String []vect = original.split(" ");
		//String word1 = vect[1];
		//String word2 = vect[2];
		//String word3 = vect[3];
		
		
		//System.out.println(vect[0]);
		
		int a =sc.nextInt();		
		int b =sc.nextInt();
		int c =sc.nextInt();
		
		int higher = max(a,b,c);
		
		showResult(higher);
		
		

		sc.close();
		
		
	}

	public static int max(int a, int b, int c) {
		int aux= 0;
			if(a>b && a>c) {
			aux = a;
		}
			else if(b>a && b>c) {
			aux = b;
		}
			else {
			aux = c;
			
	}	
		return aux;
	}
	public static void showResult(int value) {
		System.out.println("Higher = "+ value);
	}
}
