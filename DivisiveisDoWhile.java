package javabasico;

public class DivisiveisDoWhile {

	public static void main(String[] args) {
		
		// apresentar os números divisíveis por 4 entre 1 e 200
		
		int contador = 1;
		
		do {
			if (contador % 4 == 0) {
				System.out.println(contador);
			}
			contador++;
		} while (contador <= 200);
		
	}
}