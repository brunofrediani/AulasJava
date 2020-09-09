package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		System.out.println(list.size());
		for (String x : list) {
		System.out.println(x);
		}
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M'); //fun��o para remover quando come�a com M (index 0)
		for (String x : list) { //for para percorrer e imprimir a lista
		System.out.println(x);
		}
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));// retorna posicao na lista do bob
		System.out.println("Index of Marco: " + list.indexOf("Marco"));//quando n�o existe retorn -1
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		/* Stream aceita operacoes com expressao               filtra nomes com A na posi��o 0 que � o come�o
		 * lambda
		 * stream() n�o � compativel com list,			
		o Collectors.toList � para converter para lista de volta
		*/
		for (String x : result) {				
		System.out.println(x);
		}
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name); // encontra o primeiro elemento da lista que come�a com a letra
								  // caso n�o exista retorna null
	}

}
