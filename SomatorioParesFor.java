package javabasico;

public class SomatorioParesFor {

	public static void main(String[] args) {
		
		
		// apresentar o somat�rio dos valores pares existentes na faixa n�merica de 1 a 500
		
		int somatorio = 0;
		
		for (int contador = 1; contador < 501; contador++) {
			if (contador % 2 == 0) {
				somatorio += contador;
			}
		}
		System.out.println("O somat�rio dos valores pares existentes na faixa n�merica de 1 a 500 � igual a: " + somatorio);
		
	}
}