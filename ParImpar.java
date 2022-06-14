package javabasico;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		// ler um número e informar se ele é par ou ímpar
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println(numero + " é par!");
		} else {
			System.out.println(numero + " é ímpar!");
		}
		
		sc.close();
	}
}