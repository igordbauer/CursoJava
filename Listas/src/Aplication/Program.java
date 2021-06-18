package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add(2, "Marco");

		System.out.println(list.size());

		// list.remove(1); // remove tanto uma string dada ou o que estiver na posição
		// passada como
		// argumento

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-----------------------");

		// list.removeIf(x -> x.charAt(0) == 'M'); // usando predicado lambda sera visto
		// mais pra frente no curso

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-----------------------");

		System.out.println("Index of Bob: " + list.indexOf("Bob")); // quando a lista nao encontra o valor ou string
																	// pedido o valor retornado é -1

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // a função de
																											// filtro
																											// necessita
																											// que seja
																											// implementada
																											// uma nova
																											// lista que
																											// recebe o
																											// resultado
																											// da
																											// filtragem
																											// mas a
																											// função
																											// .stream
																											// não é do
																											// tipo
																											// lista por
																											// isso é
																											// necessario
																											// utilizar
																											// o
																											// .collectors.tolist()
																											// para
																											// passar
																											// para
																											// lista
																											// novamente
																											// no final
		System.out.println("-----------------------");
		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("-----------------------");
	
		
		String name = 	list.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
	
		System.out.println(name);
	}

}
