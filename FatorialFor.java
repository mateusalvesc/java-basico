package javabasico;

public class FatorialFor {

	public static void main(String[] args) {
		
		// apresentar o fatorial dos valores ímpares situados na faixa numérica de 1 a 10
		
		int numero = 1;
		int fatorial;
		
		for (int contador = 1; contador <= 10; contador++) {
		    if (contador % 2 == 1) {
		        fatorial = 1;
		        numero = contador;
		        do {
		            fatorial *= numero;
		            numero--;
		        } while (numero > 1);
		        System.out.println("O fatorial de " + contador + " é " + fatorial);
		    }
		}
	}
}