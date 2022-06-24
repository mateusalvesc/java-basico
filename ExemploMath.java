package javabasico;

public class ExemploMath {

	public static void main(String[] args) {
		
		int valor1 = 16, valor2 = 25;
		
		System.out.println("O menor valor digitado foi: " + Math.min(valor1, valor2));
		System.out.println("O maior valor digitado foi: " + Math.max(valor1, valor2));
		
		System.out.println(valor1 + "² = " + Math.pow(valor1, 2));
		System.out.println(valor2 + "² = " + Math.pow(valor2, 2));
		
		System.out.println("Raiz quadrada de " + valor1 + " = " + Math.sqrt(valor1));
		System.out.println("Raiz quadrada de " + valor2 + " = " + Math.sqrt(valor2));
		
	}
}