
public class Main {

	public static void main(String[] args) {
		
		double baseMaior, baseMenor, altura, area;
		
		baseMaior = 6.0;
		baseMenor = 4.0;			// usar o .0 para indicar que a vari�vel � do tipo double, usa-se o f para indicar que � do tipo float //
		
		altura = 5.0;
		
		area = (baseMaior + baseMenor )/2.0 *altura;
		
		System.out.println(area);
		
		
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = (double) a / b;   // usando o comando double para avisar ao compilador qual o tipo de valor deve estar na vari�vel resultado (casting)
		System.out.println(resultado);
		
		

	}

}
