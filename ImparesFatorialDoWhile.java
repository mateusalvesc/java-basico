package javabasico;

public class ImparesFatorialDoWhile {

	public static void main(String[] args) {
		
		// exibir o fatorial dos valores ímpares situados entre 0 e 10
		
		int numero = 1;
		int contador = 1;
		int fatorial;
		
		do {
			if (contador % 2 == 1) {
				fatorial = 1;
				numero = contador;
				do {
					fatorial = fatorial * numero;
					numero--;
				} while (numero > 1);
				System.out.println("O fatorial de " + contador + " é igual a: " + fatorial);
			}
			contador++;
		} while (contador <= 10);
		
	}
}