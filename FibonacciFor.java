package javabasico;

public class FibonacciFor {

	public static void main(String[] args) {
		
		// exibir a s�rie de Fibonacci do 1� at� o 15� termo
		
		int atual = 1;
		int anterior = 1;
		int proximo = 0;
		
		System.out.println("1� : " + anterior);
		System.out.println("2� : " + atual);
		
		for (int contador = 3; contador < 16; contador++) {
			proximo = anterior + atual;
			System.out.println(contador + "� : " + anterior + " + " + atual + " = " + proximo);
			anterior = atual;
			atual = proximo;
		}
	}
}