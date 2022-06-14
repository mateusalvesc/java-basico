package javabasico;

public class SomaParesWhile {

	public static void main(String[] args) {
		
		// apresentar no final o somatório dos valores pares existentes na faixa de 1 até 500
		
		int contador = 1;
		int somatorioPares = 0;
		
		while (contador <= 500) {
			if (contador % 2 == 0) {
				somatorioPares = somatorioPares + contador;
			}
			contador++;
		}
		
		System.out.println("A soma dos pares entre 1 e 500 é igual a: " + somatorioPares);
	}
}