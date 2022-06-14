package javabasico;

import java.util.Scanner;

public class MaiorMenorValor {

	public static void main(String[] args) {
		
		// ler cinco números inteiros e apresentar o maior e o menor valor digitado
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o 1º valor inteiro: ");
		int valor = sc.nextInt();
		int menor = valor;
		int maior = valor;
		
		for (int i = 2; i <= 5; i++) {
			System.out.println("Digite o " + i + "º valor inteiro: ");
			valor = sc.nextInt();
			if (valor > maior) {
				maior = valor;
			}
			if (valor < menor) {
				menor = valor;
			}
		}
		System.out.println("O maior e o menor valor digitado foi respectivamente: " + maior + " e " + menor + ".");
		sc.close();
	}
}