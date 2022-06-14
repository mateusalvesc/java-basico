package javabasico;

import java.util.Scanner;

public class QuadradoSoma {

	public static void main(String[] args) {
		
		// ler três valores inteiros e apresentar o resultado da soma dos três valores ao quadrado  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor inteiro: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor inteiro: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor inteiro: ");
		int valor3 = sc.nextInt();
		
		// soma dos valores ao quadrado;
		int resultado = (valor1 + valor2 + valor3) * (valor1 + valor2 + valor3);
		System.out.println("O resultado da soma dos três valores ao quadrado é igual a: " + resultado);
		
		sc.close();
	}
}