package javabasico;

import java.util.Scanner;

public class ProdutoSoma {

	public static void main(String[] args) {
		
		// ler quatro valores e apresentar o produto e a soma entre dois valores digitados alternados
		
		System.out.println("Soma e produto de valores");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor inteiro de A: ");
		int valorA = sc.nextInt();
		System.out.println("Digite o valor inteiro de B: ");
		int valorB = sc.nextInt();
		System.out.println("Digite o valor inteiro de C: ");
		int valorC = sc.nextInt();
		System.out.println("Digite o valor inteiro de D: ");
		int valorD = sc.nextInt();
		
		// cálculo do produto;
		int produtoValores = valorA * valorC;
		// cálculo da soma;
		int somaValores = valorB + valorD;
		
		System.out.println("O resultado do produto entre " + valorA + " e " + valorC + " é igual a: " + produtoValores);
		System.out.println("O resultado da soma entre " + valorB + " e " + valorD + " é igual a: " + somaValores);
		
		sc.close();
	}
}