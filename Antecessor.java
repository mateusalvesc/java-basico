package javabasico;

import java.util.Scanner;

public class Antecessor {

	public static void main(String[] args) {
		
		// ler um valor e exibir seu antecessor
		
		System.out.println("Antecessor");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = sc.nextInt();
		
		//Pré-incremento: --numero;
		System.out.println("O antecessor do número " + numero + " é: " + --numero + ".");
		sc.close();		
	}
}