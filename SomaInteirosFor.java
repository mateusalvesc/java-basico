package javabasico;

public class SomaInteirosFor {

	public static void main(String[] args) {
		
		
		// apresentar a soma dos cem primeiros números inteiros (1+2+3+4+...+98+99+100)
		
		int somador = 0;
		
		for (int contador = 1; contador < 101; contador++) {
			somador += contador;
		}
		System.out.println("A soma dos cem primeiros números inteiros é igual a: " + somador);
	}
}