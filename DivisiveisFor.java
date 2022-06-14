package javabasico;

public class DivisiveisFor {

	public static void main(String[] args) {
		
		// apresentar os números divisíveis por 4 menores que 200
		
		for (int contador = 1; contador < 200; contador++) {
			if (contador % 4 == 0) {
				System.out.println(contador);
			}
		}
		
	}
}