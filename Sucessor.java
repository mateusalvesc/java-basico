package javabasico;

import java.util.Scanner;

public class Sucessor {

	public static void main(String[] args) {
		
		// ler um valor inteiro e apresentar seu sucessor
		
		System.out.println("Sucessor");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int numero = sc.nextInt();
		//Pr�-incremento: ++numero;
		System.out.println("O sucessor do n�mero " + numero + " �: " + ++numero + ".");
		sc.close();
	}
}