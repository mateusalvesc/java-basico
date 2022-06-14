package javabasico;

public class FibonacciFor {

	public static void main(String[] args) {
		
		// exibir a série de Fibonacci do 1º até o 15º termo
		
		int atual = 1;
		int anterior = 1;
		int proximo = 0;
		
		System.out.println("1º : " + anterior);
		System.out.println("2º : " + atual);
		
		for (int contador = 3; contador < 16; contador++) {
			proximo = anterior + atual;
			System.out.println(contador + "º : " + anterior + " + " + atual + " = " + proximo);
			anterior = atual;
			atual = proximo;
		}
	}
}