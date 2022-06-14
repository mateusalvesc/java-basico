package javabasico;

public class FibonacciWhile {

	public static void main(String[] args) {
		
		// apresentar a s�rie de Fibonacci do primeiro at� o d�cimo quinto termo (1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610)
		
		int anterior = 1;
		int atual = 1;
		int contador = 3;
		int proximo;
		
		System.out.println("1� = " + anterior);
		System.out.println("2� = " + atual);
		
		while (contador <= 15) {
			proximo = anterior + atual;
			System.out.println(contador + "�: " + anterior + " + " + atual + " = " + proximo);
			contador++;
			anterior = atual;
			atual = proximo;
		}
		
	}
}