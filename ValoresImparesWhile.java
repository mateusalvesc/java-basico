package javabasico;

public class ValoresImparesWhile {

	public static void main(String[] args) {
		
		// apresentar todos os valores num�ricos inteiros �mpares situados na faixa de 0 a 20

		int contador = 0;
		int somatorioImpares = 0;
		
		while (contador < 21) {
			if (contador % 2 == 1) {
				somatorioImpares++;
				System.out.println(contador + " � �mpar!");
			}
			contador++;
		}
		
		System.out.println("Entre 0 e 20 existem " + somatorioImpares + " valores �mpares.");
	}
}