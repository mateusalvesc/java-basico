package javabasico;

import java.util.Scanner;

public class TrocaValores {

	public static void main(String[] args) {
		
		// ler dois valores e efetuar a troca pelas variáveis e exibir o resultado no final
		
		System.out.println("Troca de valores");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro para A: ");
		int valorA = sc.nextInt();
		System.out.println("Digite outro valor inteiro para B: ");
		int valorB = sc.nextInt();
		
		// troca de valores: A variável auxiliar recebe valorA, valorA recebe valorB e valorB recebe a auxiliar que está com o valor de A;
		int auxiliar = valorA;
		valorA = valorB;
		valorB = auxiliar;
		
		System.out.println("O valo trocado de A é: " + valorA);
		System.out.println("O valo trocado de B é: " + valorB);
		
		sc.close();
	}
}