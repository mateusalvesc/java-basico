package javabasico;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		// ler um n�mero e informar se ele � par ou �mpar
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println(numero + " � par!");
		} else {
			System.out.println(numero + " � �mpar!");
		}
		
		sc.close();
	}
}