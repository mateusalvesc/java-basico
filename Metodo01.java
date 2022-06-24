package javabasico;

public class Metodo01 {
	
	static void soma() {
		
		int valor1 = 5;
		int valor2 = 10;
		int somaf = valor1 + valor2;
		System.out.println(somaf);
	}
	
	static void subtracao() {
		
		int valor1 = 5;
		int valor2 = 10;
		int subtracaof = valor1 - valor2;
		System.out.println(subtracaof);
	}
	
	static void multiplicacao() {
		
		int valor1 = 5;
		int valor2 = 10;
		int multiplicacaof = valor1 * valor2;
		System.out.println(multiplicacaof);
	}
	
	static void divisao() {
		
		int valor1 = 5;
		int valor2 = 10;
		float divisaof = (float) valor1 / valor2;
		System.out.println(divisaof);
	}
	
	public static void main(String[] args) {
		
		soma();
		subtracao();
		multiplicacao();
		divisao();
	}
}