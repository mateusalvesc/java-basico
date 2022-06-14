package javabasico;

public class VerificaImparesFor {

	public static void main(String[] args) {
		
		// exibir os valores ímpares situados entre 0 e 20
		
		for (int contador = 0; contador < 21; contador++) {
			if (contador % 2 == 1) {
				System.out.println(contador + " é ímpar!");
			}
		}
	}
}