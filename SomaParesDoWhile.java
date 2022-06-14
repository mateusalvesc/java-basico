package javabasico;

public class SomaParesDoWhile {

	public static void main(String[] args) {
		
		int contador = 1;
		int somatorio = 0;
		
		// somar os pares existentes na faixa númerica entre 1 e 500
		
		do {
			if (contador % 2 == 0) {
				somatorio += contador;
				System.out.println(somatorio);
			}
			contador++;
		} while (contador <= 500);
	}
}