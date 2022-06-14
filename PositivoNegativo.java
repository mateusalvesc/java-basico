package javabasico;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		
		// ler um valor inteiro, verificar e apresentar se ele é positivo ou negativo
		
		System.out.println("Digite um número inteiro: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		// condição composta
		if (numero >= 0) {
			System.out.println(numero + " é positivo!");
		} else {
			System.out.println(numero + " é negativo!");
		}
		sc.close();
	}
}