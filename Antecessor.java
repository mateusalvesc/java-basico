package javabasico;

import java.util.Scanner;

public class Antecessor {

	public static void main(String[] args) {
		
		// ler um valor e exibir seu antecessor
		
		System.out.println("Antecessor");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int numero = sc.nextInt();
		
		//Pr�-incremento: --numero;
		System.out.println("O antecessor do n�mero " + numero + " �: " + --numero + ".");
		sc.close();		
	}
}