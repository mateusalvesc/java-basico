package javabasico;

import java.util.Scanner;

public class SituacaoValores {

	public static void main(String[] args) {
		
		// ler dois valores e exibir a mensagem correspondente a condi��o entre eles
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor inteiro: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor inteiro: ");
		int valor2 = sc.nextInt();
		
		if (valor1 == valor2) {
			System.out.println("Os valores digitados s�o iguais!");
		} else if (valor1 > valor2) {
			System.out.println("O primeiro valor digitado � maior!");
		} else {
			System.out.println("O segundo valor digitado � maior!");
		}
		
		sc.close();
	}
}