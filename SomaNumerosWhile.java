package javabasico;

public class SomaNumerosWhile {

	public static void main(String[] args) {
		
		// apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100)
		
		int contador = 1;
		int acumulador = 0;
		
		while (contador <= 100) {
			acumulador = acumulador + contador;
			contador++;
		}
		
		System.out.println("O total da soma dos cem primeiros números inteiros é igual a: " + acumulador);
	}
}