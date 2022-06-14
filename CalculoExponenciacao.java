package javabasico;

import java.util.Scanner;

public class CalculoExponenciacao {

	public static void main(String[] args) {
		
		// cálculo de exponenciação a partir da diferença entre os valores inteiros digitados  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite outro valor inteiro: ");
		int valor2 = sc.nextInt();
		
		int resultado = (valor1 - valor2) * (valor1 - valor2);
		
		System.out.println("O resultado do quadrado da diferença entre " + valor1 + " e " + valor2 + " é igual a: " + resultado);	
		
		sc.close();
	}
}