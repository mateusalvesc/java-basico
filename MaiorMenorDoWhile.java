package javabasico;

import java.util.Scanner;

public class MaiorMenorDoWhile {

	public static void main(String[] args) {
				
		// ler valores inteiros at� que o usu�rio digitado um valor negativo e no final apresentar o maior e o menor valor digitado
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor n�mero inteiro: ");
		int valor = sc.nextInt();
		int menor = valor;
		int maior = valor;
		
		do {
			if (valor > maior) {
				maior = valor;
			}
			if (valor < menor) {
				menor = valor;
			}
			System.out.println("Digite outro valor n�merico inteiro [- interrompe]: ");
			valor = sc.nextInt();
		} while (valor > 0);
		
		System.out.println("O maior valor e o menor valor digitado respectivamente foi: " + maior + " e " + menor + ".");
		
		sc.close();
	}
}