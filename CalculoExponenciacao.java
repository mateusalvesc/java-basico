package javabasico;

import java.util.Scanner;

public class CalculoExponenciacao {

	public static void main(String[] args) {
		
		// c�lculo de exponencia��o a partir da diferen�a entre os valores inteiros digitados  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite outro valor inteiro: ");
		int valor2 = sc.nextInt();
		
		int resultado = (valor1 - valor2) * (valor1 - valor2);
		
		System.out.println("O resultado do quadrado da diferen�a entre " + valor1 + " e " + valor2 + " � igual a: " + resultado);	
		
		sc.close();
	}
}