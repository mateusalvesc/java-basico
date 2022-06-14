package javabasico;

import java.util.Scanner;

public class Sucessor {

	public static void main(String[] args) {
		
		// ler um valor inteiro e apresentar seu sucessor
		
		System.out.println("Sucessor");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numero = sc.nextInt();
		//Pré-incremento: ++numero;
		System.out.println("O sucessor do número " + numero + " é: " + ++numero + ".");
		sc.close();
	}
}